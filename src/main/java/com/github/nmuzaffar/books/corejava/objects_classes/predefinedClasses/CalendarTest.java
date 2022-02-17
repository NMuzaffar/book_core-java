package com.github.nmuzaffar.books.corejava.objects_classes.predefinedClasses;

import java.time.LocalDate;

/**
 * This program tests the LocalDate class.
 */
public class CalendarTest {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    int month = date.getMonthValue();
    int today = date.getDayOfMonth();

  }

}
