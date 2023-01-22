package MessageWriter.MessageWriter.service.impl;

import MessageWriter.MessageWriter.dto.MessageDto;
import MessageWriter.MessageWriter.entity.Message;
import MessageWriter.MessageWriter.exception.BadRequestException;
import MessageWriter.MessageWriter.repositories.MessageRepository;
import MessageWriter.MessageWriter.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    /**
     * метод для записи сообщения в БД и лог
     * **/
    @Override
    @Transactional
    public Message saveMessage(MessageDto messageDto) {

        Message message = new Message();

        message.setMessage(messageDto.getMessage());
        message.setType(messageDto.getType());
        message.setLevel(messageDto.getLevel());

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(messageDto.getTime());
            Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
            message.setTime(timestamp);
            log.info(messageDto.toString());
        } catch(ParseException e) {
            throw new BadRequestException();
        }

        return messageRepository.save(message);
    }
}
