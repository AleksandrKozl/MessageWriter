package MessageWriter.MessageWriter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BadRequestException extends ResponseStatusException {
    public BadRequestException(){super(HttpStatus.BAD_REQUEST, "Wrong format of date or time. The date and time must be in the format: yyyy-MM-dd hh:mm:ss.SSS ");}
}
