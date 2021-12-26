package com.epam;

import java.lang.Iterable;
import java.util.Iterator;

public class TestList<T> implements Iterable<T> {
    private TestNode<T> begin;
    private TestNode<T> end;

    public Iterator<T> iterator() {
        return new TestIterator<T>(this);
    }

    public TestNode<T> getBegin() {
        return begin;
    }

    public TestNode<T> getEnd() {
        return end;
    }

    public void add(T value) {
        TestNode<T> t = new TestNode<>(value, null);

        if (begin == null) {
            begin = t;
            end = t;

        } else {
            end.setNext(t);
            end = t;
        }
    }
}
