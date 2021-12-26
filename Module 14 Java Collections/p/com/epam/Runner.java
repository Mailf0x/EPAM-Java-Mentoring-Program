package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<TestEntity> list = new ArrayList<>();

        list.add(new TestEntity("string"));
        list.add(new TestEntity("another string"));
    }
}
