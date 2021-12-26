/*
    Use generic method Collections,emptyList without and with type
    interface
*/

package com.epam;

import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> list = Collections.<String>emptyList();
        List<String> anotherList = Collections.emptyList();
    }
}
