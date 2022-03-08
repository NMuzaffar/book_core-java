package com.github.nmuzaffar.books.corejava.objects_classes.objectConstruction;

import java.util.Random;

class Employee {

  private static int nextId;

  private int id;
  private String name = "unknown"; // instance field initialization
  private double salary;

  private static Random generator = new Random();

  // static initialization block
  static {
    // set nextId to a random number between 0 and 9999
    nextId = generator.nextInt(10000);
  }

  // object initialization block
  {
    id = nextId;
    nextId++;
  }

  // three overloaded constructors
  public Employee(String n, double s) {
    name = n;
    salary = s;
  }

  public Employee(double s) {
    // calls the Employee(String, double) constructor
    this("Employee #" + nextId, s);
  }

  // the default constructor
  public Employee() {
    // id initialized in initialization block
    // name initialized to ""--see above
    // salary not explicitly set--initialized to 0
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
}
