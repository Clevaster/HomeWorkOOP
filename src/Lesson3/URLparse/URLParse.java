package Lesson3.URLparse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lena on 23.05.2015.
 */
public class URLParse {
/*
    URL:
    para1=value1&param2=value2&param3=value3.

*/

    public static void main(String[] args) {

        String url = "para1=value1&param2=value2&param3=value3";
        try {
            System.out.println(parseURL(url)); //IT'S WRONG!! DON'T UNDERSTAND HOW TO CALL THIS METHOD CORRECTLY
        } catch (URLParseException e) {
            e.getMessage();
        }
    }

    public static HashMap<String, String> parseURL(String url) throws URLParseException
    {

        String[] firstParse = url.split("&");
        Map<String, String> result = new HashMap<>();

        for (int i = 0; i < firstParse.length; i++) {

            String[] secondParse = firstParse[i].split("=");
            result.put(secondParse[0], secondParse[1]);
          throw new URLParseException("Wrong format");
        }

        return (HashMap<String, String>) result;
    }
}
