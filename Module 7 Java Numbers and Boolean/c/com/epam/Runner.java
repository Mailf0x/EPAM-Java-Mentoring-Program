package com.epam;

public class Runner {

    public void methodWithBooleanClass() {
        Boolean a = Boolean.valueOf("true");
        String b = a.toString();
    }

    public void methodWithBooleanType() {
        boolean a = Boolean.parseBoolean("true");
        String b = String.valueOf(a);
    }
}
