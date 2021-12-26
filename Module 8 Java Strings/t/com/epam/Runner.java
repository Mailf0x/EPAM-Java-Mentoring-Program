package com.epam;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Runner {

    public static void main(String[] args) {
        Pattern a = Pattern.compile("s....g");
        Matcher b = a.matcher("string");

        System.out.println(b.matches());
    }
}
