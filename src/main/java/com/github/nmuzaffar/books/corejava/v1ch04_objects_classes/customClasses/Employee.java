package com.github.nmuzaffar.books.corejava.v1ch04_objects_classes.customClasses;

import java.time.LocalDate;

class Employee {

  private String name;
  private double salary;
  private LocalDate hireDay;

  public Employee(String n, double s, int year, int month, int day) {
    this.name = n;
    this.salary = s;
    this.hireDay = LocalDate.of(year, month, day);
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
