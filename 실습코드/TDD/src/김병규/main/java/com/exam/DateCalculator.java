package com.exam;

import java.time.LocalDate;

public class DateCalculator {

    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        return currentDate.getYear() - birthDate.getYear();
    }

    public int calculateDaysBetween(LocalDate startDate, LocalDate endDate) {
        return (int) startDate.until(endDate).getDays();
    }

    public boolean isLeafYear(int year) {
        return LocalDate.ofYearDay(year, 1).isLeapYear();
    }
}
