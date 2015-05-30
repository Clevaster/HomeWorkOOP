package lesson3.parseURL;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lena on 23.05.2015.
 */
public class URLParse {

    public static void main(String[] args) {
        String url = "para1=value1&param2=value2&param3=value3";
        String url2 = "p&param2=value2&param3=value3";

        try {
            Map<String, String> map = parseURL(url);
            System.out.println(map);

        } catch (URLParseException e) {
            e.getMessage();
        }

        try {
            Map<String, String> map = parseURL(url2);
            System.out.println(map);

        } catch (URLParseException e) {
            System.out.println("Wrong");
        }
    }

    //method returns abstract
    public static Map<String, String> parseURL(String url) throws URLParseException {

        //split by & into array
        String[] firstParse = url.split("&");

        //create map to save result
        Map<String, String> result = new HashMap<>();


        for (String a : firstParse) {

            //!!!!Don't print throws exception!!!

            if (!a.contains("=")) throw new URLParseException("Wrong URL");
            String[] secondParse = a.split("=");

            result.put(secondParse[0], secondParse[1]);
        }

        return result;
    }
}
