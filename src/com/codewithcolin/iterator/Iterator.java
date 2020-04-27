package com.codewithcolin.iterator;

public interface Iterator<T> {
    void add(T type);
    boolean hasNext();
    void next();
    T current();
}
