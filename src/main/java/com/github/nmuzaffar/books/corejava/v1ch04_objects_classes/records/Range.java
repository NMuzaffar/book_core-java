package com.github.nmuzaffar.books.corejava.v1ch04_objects_classes.records;

record Range(int from, int to) {
    // A compact constructor
    public Range {
        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }
    }
}
