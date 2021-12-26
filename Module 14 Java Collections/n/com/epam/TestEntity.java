package com.epam;

public class TestEntity implements Comparable {
    private Integer field;

    public TestEntity(Integer field) {
        this.field = field;
    }

    public Integer getField() {
        return field;
    }

    public int compareTo(Object object) {
        TestEntity testEntity = (TestEntity)object;

        return field.compareTo(testEntity.getField());
    }
}
