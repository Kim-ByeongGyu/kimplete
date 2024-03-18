package com.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateCalculatorTest {
    private DateCalculator dateCalculator;

    @BeforeEach
    void setup(){
        dateCalculator = new DateCalculator();
    }

    @Test
    void calculateAge(){
        LocalDate birthDate = LocalDate.of(2002, 9, 29);
        LocalDate currentDate = LocalDate.of(2024, 3, 18);

        Assertions.assertEquals(22, dateCalculator.calculateAge(birthDate, currentDate));
    }
    @Test
    void calculateDaysBetween(){
        LocalDate day1 = LocalDate.of(2024, 2, 15);
        LocalDate day2 = LocalDate.of(2024, 3, 1);

        Assertions.assertEquals(15, dateCalculator.calculateDaysBetween(day1, day2));
    }
    @Test
    void isLeapYear(){
        int leapYear = 2024;
        boolean isLeap = dateCalculator.isLeapYear(leapYear);

        Assertions.assertEquals(true, isLeap);
    }
}
