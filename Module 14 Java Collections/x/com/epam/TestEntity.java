package com.epam;

public class TestEntity {
    private Integer field;

    public TestEntity(Integer field) {
        this.field = field;
    }

    public Integer getField() {
        return field;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof TestEntity)) return false;
        TestEntity testEntity = (TestEntity)object;

        return field.equals(testEntity.getField());
    }

    @Override
    public int hashCode() {
        return field;
    }
}
