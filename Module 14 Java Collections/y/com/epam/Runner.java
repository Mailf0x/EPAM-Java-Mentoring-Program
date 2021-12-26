package com.epam;

import java.util.Set;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {
        Set<TestEntity> set = new TreeSet<>();

        set.add(new TestEntity(8));
        set.add(new TestEntity(16));
        set.add(new TestEntity(32));
        set.add(new TestEntity(64));
    }
}
