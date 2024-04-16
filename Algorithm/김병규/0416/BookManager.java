package com.example.day0416;

import java.util.*;

public class BookManager {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        for (Book b : bookList) {
            if (book.equals(b)) {
                System.out.println("책이 이미 존재합니다: " + book);
                return;
            }
        }
        bookList.add(book);
        System.out.println("책이 추가되었습니다: " + book);
    }

    public void removeBook(String name, String writer) {
        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getName().equals(name) && book.getWriter().equals(writer)) {
                iterator.remove();
                System.out.println("도서가 제거되었습니다: " + book);
                return;
            }
        }
        System.out.println("일치하는 도서가 없습니다: 이름 = " + name + ", 저자 = " + writer);
    }

    public void displayBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public void sortBooksByYear() {
        Collections.sort(bookList, new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
