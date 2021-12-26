package com.epam;

public class TestNode<T> {
    private T value;
    private TestNode<T> next;

    public TestNode(T value, TestNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public TestNode<T> getNext() {
        return next;
    }

    public void setNext(TestNode<T> next) {
        this.next = next;
    }
}
