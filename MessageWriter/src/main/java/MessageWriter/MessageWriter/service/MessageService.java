package MessageWriter.MessageWriter.service;

import MessageWriter.MessageWriter.dto.MessageDto;
import MessageWriter.MessageWriter.entity.Message;

public interface MessageService {

    Message saveMessage(MessageDto messageDto);
}
