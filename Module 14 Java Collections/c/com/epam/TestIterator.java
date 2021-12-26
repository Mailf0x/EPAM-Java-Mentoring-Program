package com.epam;

import java.util.Iterator;

public class TestIterator<T> implements Iterator<T> {
    TestNode<T> current;

    public TestIterator(TestList<T> list) {
        current = list.getBegin();
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        T value = current.getValue();

        current = current.getNext();
        return value;
    }

    public void remove() {}
}
