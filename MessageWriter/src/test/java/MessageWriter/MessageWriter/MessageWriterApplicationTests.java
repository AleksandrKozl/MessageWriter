package MessageWriter.MessageWriter;

import MessageWriter.MessageWriter.entity.Message;
import MessageWriter.MessageWriter.repositories.MessageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

import java.sql.Timestamp;
import java.util.Optional;

@SpringBootTest
class MessageWriterApplicationTests {

	@Autowired
	private MessageRepository messageRepository;

	private Message message;

	@Test
	void repositoryTest() {
		message = Message.builder().message("test message").type("test type").level("test level")
				.time(Timestamp.valueOf("2023-01-21 17:30:30.177")).build();

		messageRepository.save(message);

		Assert.assertNotNull(messageRepository.findById(1L));

		Message messageFromBD = messageRepository.findById(1L).get();

		Assert.assertNotNull(messageFromBD.getMessage());
		Assert.assertNotNull(messageFromBD.getType());
		Assert.assertNotNull(messageFromBD.getLevel());
		Assert.assertNotNull(messageFromBD.getTime());

		messageRepository.deleteById(1L);
		Assert.assertEquals(messageRepository.findById(1L), Optional.empty());
	}

}
