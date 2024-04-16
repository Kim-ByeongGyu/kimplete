package day11;
import java.util.*;

class Book{
    private String title;
    private String author;
    private int release;
    
    public Book(String title, String author, int release){
        this.title = title;
        this.author = author;
        this.release = release;
    }

    public int getRelease() {
        return release;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", release=" + release;
    }
}

class BookManager  {
    List<Book> b = new ArrayList<>();
    // 도서 추가
    public void addBook(Book book) {
        if(b.contains(book)){
            System.out.println("이미 존재하는 책이므로 추가할 수 없습니다.");
        }else{
            b.add(book);
        }
    }
    // 도서 출력
    public void displayBooks() {
        for(Book temp : b ){
            System.out.println(temp);
        }

    }
    // 도서 정렬 : 년도별로
    public void sortBooksByYear() {
        Collections.sort(b, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getRelease(), o2.getRelease());
            }
        });
    }

}

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.addBook(new Book("모두의 자바", "강경미", 2015));
        manager.addBook(new Book("이거이 자바다", "신용권", 2018));
        manager.addBook(new Book("자바의 정석", "남궁성", 2013));
        System.out.println("--------------------------------정렬 전--------------------------------");
        manager.displayBooks();
        manager.sortBooksByYear();
        System.out.println("--------------------------------정렬 후--------------------------------");
        manager.displayBooks();

    }
}
