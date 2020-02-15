// Jonathan Klein
// 2/10/2020
// Book.java

public class Book {
    private String title;
    private String author;
    private String type;
    private int copyYear;

    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public int getCopyYear() {
        return copyYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCopyYear(int copyYear) {
        this.copyYear = copyYear;
    }

    public static boolean searchByTitle(String title, Book[] bookArray){
        for (Book b : bookArray) {
            if(b.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public static boolean searchByAuthor(String author, Book[] bookArray){
        for (Book b : bookArray) {
            if(b.getAuthor().equals(author)){
                return true;
            }
        }
        return false;
    }

    public static void displayAllBooks(Book[] bookArray){
        for (Book b : bookArray) {
            System.out.println("Title: " + b.getTitle() + "\nAuthor: " + b.getAuthor());
        }
    }

    public static void displayBooksByAuthor(String author, Book[] bookArray){
        int amt = 0;
        for (Book b : bookArray) {
            if(b.getAuthor().equals(author)){
                System.out.println(b);
                amt++;
            }
        }
        if(amt == 0){
            System.out.println("No books by this author found.");
        }
    }

    @Override
    public String toString() {
        String temp = "";
        if (!(title == null)){
            temp += ("\nTitle: " + title);
        }
        if (!(author == null)){
            temp += ("\nAuthor: " + author);
        }
        if (!(type == null)){
            temp += ("\nType: " + type);
        }
        if (!(copyYear == 0)){
            temp += ("\n\u00a9 " + copyYear);
        }

        return temp;
    }
}
