package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular Expressions
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        String str1 = "А001ТТ";
        String regex = "^[АВЕКМНОРСТУХ]\\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(str1);
        if (matcher.find()) {
            logger.info(matcher.group());
        }

        String str2 = "ivanov_23@mail.COM";
        String regex2 = "^[A-Za-z]+_[0-9]+@{1}[a-z]{3,5}\\.[A-Z]{2,3}";
        Pattern compile2 = Pattern.compile(regex2);
        Matcher matcher2 = compile2.matcher(str2);
        if (matcher2.find()) {
            logger.info(matcher2.group());
        }
    }
}
