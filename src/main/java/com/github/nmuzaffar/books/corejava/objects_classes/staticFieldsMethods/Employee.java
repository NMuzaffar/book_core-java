package com.github.nmuzaffar.books.corejava.objects_classes.staticFieldsMethods;

class Employee {

  private static int nextId = 1;

  private int id;
  private String name;
  private double salary;

  public Employee(String n, double s) {
    id = advanceId();
    name = n;
    salary = s;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public static int advanceId() {
    int r = nextId; // obtain next available id
    nextId++;
    return r;
  }
}
