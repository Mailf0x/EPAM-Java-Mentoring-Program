package com.epam;

public class Runner {

    public static String downcast(Object o) {
        String result = null;

        if (o instanceof String) {
            result = (String)o;
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "string";
        Object b = (Object)a;
        String c = downcast(b);
    }
}
