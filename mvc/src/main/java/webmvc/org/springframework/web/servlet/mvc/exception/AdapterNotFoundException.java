package webmvc.org.springframework.web.servlet.mvc.exception;

public class AdapterNotFoundException extends RuntimeException {
    public AdapterNotFoundException(String message) {
        super(message);
    }
}