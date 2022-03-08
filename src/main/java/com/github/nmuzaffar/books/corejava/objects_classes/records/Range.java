package com.github.nmuzaffar.books.corejava.objects_classes.records;

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
