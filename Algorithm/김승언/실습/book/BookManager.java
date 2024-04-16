package com.example.day0416.book;

import java.util.*;

class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            System.out.println("도서 추가: " + book.getTitle());
        } else {
            System.out.println("이미 존재하는 도서입니다.");
        }
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("도서 삭제: " + book.getTitle());
        } else {
            System.out.println("해당하는 도서를 찾을 수 없습니다.");
        }
    }

    public void findBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("도서 정보: " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당하는 도서를 찾을 수 없습니다.");
        }
    }

    public void displayBooks() {
        System.out.println("전체 도서 목록:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void sortBooksByYear() {
        Collections.sort(books, Comparator.comparingInt(Book::getPublicationYear));
        System.out.println("출판년도 순으로 정렬된 도서 목록:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
