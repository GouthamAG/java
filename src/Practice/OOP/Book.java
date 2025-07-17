package src.practice.oop;

public class Book {
    
    private String title;
    private String author;
    private Integer pages;
    
    public Book(String title, String author, Integer pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo(){
        System.out.println(String.format("Title: %s, Author: %s, Pages: %d", this.title, this.author, this.pages));
    }

    public static void main(String[] args) {
        Book book1 = new Book("Title1", "Author1", 10);
        Book book2 = new Book("Title2", "Author2", 11);
        book1.displayInfo();
        book2.displayInfo();
    }
}
