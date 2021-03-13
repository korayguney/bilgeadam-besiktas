package com.bilgeadam.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    public static boolean IsUrlMatch(String url) {
        String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        try {
            Pattern patt = Pattern.compile(pattern);
            Matcher matcher = patt.matcher(url);
            return matcher.matches();
        } catch (RuntimeException e) {
            return false;
        }
    }
}
