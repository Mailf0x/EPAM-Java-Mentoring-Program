package com.epam;

public class TestEntity {
    private String field;

    public TestEntity(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof TestEntity)) return false;
        TestEntity testEntity = (TestEntity)object;

        return field.equals(testEntity.getField());
    }

    @Override
    public int hashCode() {
        return field.hashCode();
    }
}
