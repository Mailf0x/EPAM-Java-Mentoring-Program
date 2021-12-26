package com.epam;

import java.lang.reflect.Field;

public class Runner {

    public static void main(String[] args) {
        Field[] fields = Processor.class.getDeclaredFields();

        for (Field f : fields) {
            f.getAnnotation(StringAnnotation.class).getValue();
        }
    }
}
