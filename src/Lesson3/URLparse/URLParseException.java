package Lesson3.URLparse;

/**
 * Created by Lena on 23.05.2015.
 */
public class URLParseException extends Exception {


    public URLParseException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "URLParseException:" + super.getMessage();
    }

}
