package com.github.nmuzaffar.books.corejava.v1ch04_objects_classes.staticFieldsMethods;

/** This program demonstrates static methods. */
public class StaticTest {

  public static void main(String[] args) {
    // fill the staff array with three Employee objects
    var staff = new Employee[3];

    staff[0] = new Employee("Tom", 40000);
    staff[1] = new Employee("Dick", 60000);
    staff[2] = new Employee("Harry", 65000);

    // print out information about all Employee objects
    for (Employee e : staff) {
      System.out.println("id=" + e.getId() + ",name=" + e.getName() + ",salary=" + e.getSalary());
    }

    int n = Employee.advanceId();
    System.out.println("Next issued id=" + n);
  }
}
