package com.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateCalculatorTest {
    private DateCalculator dateCalculator;

    @BeforeEach
    void setUp() {
        dateCalculator = new DateCalculator();
    }

    @Test
    void testCalculateAge () {
        LocalDate birthDate = LocalDate.of(2023,5,15);
        LocalDate currentDate = LocalDate.of(2024,3,18);
        int expectedAge = 1;
        int actualAge = dateCalculator.calculateAge(birthDate,currentDate);
        Assertions.assertEquals(expectedAge,actualAge);
    }

    @Test
    void testCalculateDaysBetween () {
        LocalDate startDate = LocalDate.of(2022,2,15);
        LocalDate endDate = LocalDate.of(2022,3,1);
        int expectedDays = 14;
        int actualDays = dateCalculator.calculateDaysBetween(startDate,endDate);
        Assertions.assertEquals(expectedDays,actualDays);
    }

    @Test
    void testIsLeafYear () {
        int leafYear = 2024;
        boolean isLeaf = dateCalculator.isLeafYear(leafYear);
        Assertions.assertEquals(true,isLeaf);
    }
}
