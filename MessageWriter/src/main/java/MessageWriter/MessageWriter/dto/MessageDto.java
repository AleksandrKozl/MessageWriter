package MessageWriter.MessageWriter.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * DTO для сущности Message
 * **/
@Getter
@Setter
public class MessageDto {

    /**
     * сообщение
     * **/
    private String message;

    /**
     * тип сообщения
     * **/
    private String type;

    /**
     * уровень сообщения
     * **/
    private String level;

    /**
     * временная метка сообщения
     * **/
    private String time;

    @Override
    public String toString() {
        return "{" +
                "\"message\": " + "\"" + message + "\"" +
                ", \"type\": " + "\"" + type + "\"" +
                ", \"level\": " + "\"" + level + "\"" +
                ", \"time\": " + "\"" + time + "\"" +
                '}';
    }
}
