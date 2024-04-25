package com.example.day0425;

import java.util.*;
import java.util.stream.Collectors;

class Temperature {
    private String city;
    private int maxTemp;

    public Temperature(String city, int maxTemp) {
        this.city = city;
        this.maxTemp = maxTemp;
    }

    public String getCity() {
        return city;
    }

    public int getMaxTemp() {
        return maxTemp;
    }
}

public class PracticeExam07 {
    public static void main(String[] args) {
        // 실습 문제 7: 도시별 최고 온도 기록
        // 여러 도시의 일일 최고 온도가 주어졌을 때, 각 도시의 최고 온도를 찾으시오.
        List<Temperature> temperatures = Arrays.asList(
                new Temperature("Seoul", 33),
                new Temperature("New York", 30),
                new Temperature("Seoul", 34),
                new Temperature("New York", 28)
        );

        Map<String, Integer> result = temperatures.stream()
//                                  toMap (key, value, 동일한 키를 가진 요소가 충돌할 때 어떻게 값을 병합할지)
                .collect(Collectors.toMap(Temperature::getCity, Temperature::getMaxTemp, Integer::max));

        result.forEach((city, temp) -> System.out.println(city + " : " + temp));
    }
}
