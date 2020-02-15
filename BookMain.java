// Jonathan Klein
// 2/10/2020
// BookMain.java

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("The Maze Runner");
        b1.setAuthor("James Dashner");
        b1.setType("Dystopian");
        b1.setCopyYear(2009);

        Book b2 = new Book();
        b2.setTitle("The Hunger Games");
        b2.setAuthor("Suzanne Collins");
        b2.setType("Dystopian");
        b2.setCopyYear(2008);

        Book b3 = new Book();
        b3.setTitle("Hamlet");
        b3.setAuthor("William Shakespeare");
        b3.setType("Tragedy");
        b3.setCopyYear(1609);

        Book b4 = new Book();
        b4.setTitle("Don Quixote");
        b4.setAuthor("Miguel de Cervantes");
        b4.setType("Satire");
        b4.setCopyYear(1605);

        Book b5 = new Book();
        b5.setTitle("Wonder");
        b5.setAuthor("R.J. Palacio");
        b5.setType("Literature");
        b5.setCopyYear(2012);

        System.out.println(b1);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b1.getTitle());
        System.out.println(b2.getTitle());
        System.out.println(b3.getAuthor());
        System.out.println(b4.getAuthor());
        System.out.println(b5.getCopyYear());

        Book[] bookArray = new Book[10];
        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;
        bookArray[3] = b4;
        bookArray[4] = b5;
        bookArray[5] = new Book();
        bookArray[5].setTitle("Educated");
        bookArray[5].setAuthor("Tara Westover");
        bookArray[5].setType("Non-fiction");
        bookArray[5].setCopyYear(2018);

        bookArray[6] = new Book();
        bookArray[6].setTitle("Carrie");
        bookArray[6].setAuthor("Stephen King");
        bookArray[6].setType("Horror");
        bookArray[6].setCopyYear(1974);

        bookArray[7] = new Book();
        bookArray[7].setTitle("The Shining");
        bookArray[7].setAuthor("Stephen King");
        bookArray[7].setType("Horror");
        bookArray[7].setCopyYear(1977);

        bookArray[8] = new Book();
        bookArray[8].setTitle("Fahrenheit 451");
        bookArray[8].setAuthor("Ray Bradbury");
        bookArray[8].setType("Fiction");
        bookArray[8].setCopyYear(1953);

        bookArray[9] = new Book();
        bookArray[9].setTitle("Harry Potter and the Sorcerer's Stone");
        bookArray[9].setAuthor("J.K. Rowling");
        bookArray[9].setType("Fiction");
        bookArray[9].setCopyYear(1997);

        System.out.println(bookArray[5].getType());
        System.out.println(bookArray[6].getType());

        for (Book b : bookArray) {
            System.out.println(b);
        }

        for (Book b : bookArray) {
            System.out.println(b.getTitle());
        }

        for (Book b : bookArray) {
            System.out.println(b.getCopyYear() + b.getTitle() + b.getAuthor());
        }

        for (Book b : bookArray) {
            if(b.getType().equals("Fiction")){
                System.out.println(b);
            }
        }

        for (Book b : bookArray) {
            if(b.getType().equals("Non-Fiction")){
                System.out.println(b);
            }
        }

        for (Book b : bookArray) {
            if(b.getCopyYear()>1950){
                System.out.println(b);
            }
        }

        Book.searchByTitle("Carrie", bookArray);
        Book.searchByTitle("carrie", bookArray);
        Book.searchByTitle("Catcher in the Rye", bookArray);

        Book.searchByAuthor("Stephen King", bookArray);
        Book.searchByAuthor("ray bradbury", bookArray);
        Book.searchByAuthor("Mr. Watson", bookArray);

        Book.displayBooksByAuthor("Stephen King", bookArray);
        Book.displayBooksByAuthor("J.K. Rowling", bookArray);
        Book.displayBooksByAuthor("Ray Bradbury", bookArray);

        Student s1 = new Student();
        s1.rentBook(b1);
        s1.rentBook(b2);
        s1.rentBook(b3);
        s1.displayRentedBooks();
        s1.rentBook(b4);
        s1.rentBook(b5);
        s1.displayRentedBooks();
        s1.rentBook(bookArray[5]);

    }
}
