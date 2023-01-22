package MessageWriter.MessageWriter.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * сущность сообщение
 * **/
@Entity
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@Table(name = "MESSAGE")
public class Message {

    /**
     * уникальный идентификатор
     * **/
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * сообщение
     * **/
    @Column(name = "MESSAGE")
    private String message;

    /**
     * тип сообщения
     * **/
    @Column(name = "TYPE")
    private String type;

    /**
     * уровень сообщения
     * **/
    @Column(name = "LEVEL")
    private String level;

    /**
     * временная метка сообщения
     * **/
    @Column(name = "TIME")
    private Timestamp time;
}
