package MessageWriter.MessageWriter.controller;

import MessageWriter.MessageWriter.dto.MessageDto;
import MessageWriter.MessageWriter.service.MessageService;
import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/core-api")
public class MessageRestController {

    private final MessageService messageService;

    public MessageRestController(MessageService messageService) {
        this.messageService = messageService;
    }

    /**
     * запись сообщения в БД и лог
     * **/
    @PostMapping("/logs")
    public ResponseEntity<String> addMessage(@RequestBody MessageDto messageDto){
        messageService.saveMessage(messageDto);
        return new ResponseEntity<>("200 OK",HttpStatus.OK);
    }

    /**
     * выход из приложения
     * **/
    @GetMapping("/exit")
    public void appExit(){
        System.exit(0);
    }
}
