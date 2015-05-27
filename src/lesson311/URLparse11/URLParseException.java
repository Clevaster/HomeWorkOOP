package lesson311.URLparse11;

/**
 * Created by Lena on 23.05.2015.
 */

//__________
//4. My Exception


public class URLParseException extends Exception {


    public URLParseException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "URLParseException:" + super.getMessage();
    }

}
