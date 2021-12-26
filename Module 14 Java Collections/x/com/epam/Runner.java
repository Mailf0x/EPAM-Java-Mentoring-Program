package com.epam;

import java.util.HashSet;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        Set<TestEntity> set = new HashSet<>();

        set.add(new TestEntity(4));
        set.add(new TestEntity(8));
        set.add(new TestEntity(16));
        set.add(new TestEntity(32));
    }
}
