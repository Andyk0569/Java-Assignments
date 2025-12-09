package concept_implementation;

class Book {
    private String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getters and setters for Title field
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        Book bk = new Book("DSA in Java", "Robert Lafore");
        bk.displayInfo();
    }
}