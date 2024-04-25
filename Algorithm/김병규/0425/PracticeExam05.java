package com.example.day0425;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

public class PracticeExam05 {
    public static void main(String[] args) {
        // 실습 문제 5: 제품 카테고리별 평균 가격 계산
        // 주어진 제품 리스트에서 각 카테고리별로 평균 가격을 계산하시오.
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00),
                new Product("Smartphone", "Electronics", 700.00),
                new Product("Desk", "Furniture", 300.00),
                new Product("Chair", "Furniture", 150.00)
        );

        Map<String, Double> avgSalary = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)));
        avgSalary.forEach((cate, avg) -> System.out.println(cate + " : " + avg));
    }
}
