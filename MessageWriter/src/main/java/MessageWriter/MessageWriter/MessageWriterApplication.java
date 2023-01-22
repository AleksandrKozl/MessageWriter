package MessageWriter.MessageWriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("MessageWriter.MessageWriter.entity")
public class MessageWriterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageWriterApplication.class, args);
	}

}
