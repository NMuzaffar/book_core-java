package com.github.nmuzaffar.books.corejava.v1ch04_objects_classes.packages.nested;

// the classes in this file are part of this package

import java.time.LocalDate;

// import statements come after the package statement

public class Employee {

  private String name;
  private double salary;
  private LocalDate hireDay;

  public Employee(String name, double salary, int year, int month, int day) {
    this.name = name;
    this.salary = salary;
    hireDay = LocalDate.of(year, month, day);
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public LocalDate getHireDay() {
    return hireDay;
  }

  public void raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
  }
}
