package sena.classwork20231104;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sergej Chumakov on 04.11.2023
 */
public class Main {
    public static void main(String[] args) {

        String regEmail = "(\\w)+@(\\w+\\.)(\\w+)(\\.\\w+)*@*";

//        (\w+)@(\w+\.)(\w+)(\.\w+)*

        Pattern pattern = Pattern.compile(regEmail);

        String s = "serhii@aol.com@";
        Matcher matcher = pattern.matcher(s);

        System.out.println(matcher.find());

    }
}
