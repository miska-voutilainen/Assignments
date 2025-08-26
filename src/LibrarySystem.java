import java.util.ArrayList;

// Book class represents a book with title, author, publication year, rating, and reviews
class Book {
    private final String title;
    private final String author;
    private final int publicationYear;
    private final ArrayList<String> reviews = new ArrayList<>();
    private double rating;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public String toString() {
        return "Title: \"" + title + "\", Author: \"" + author + "\", Year: " + publicationYear;
    }
}

// User class represents a library user with name, age, and borrowed books
class User {
    private final String name;
    private final int age;
    private final ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Library class manages books and users, and provides various operations
class Library {
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int count = 1;
        for (Book book : books) {
            System.out.println(count++ + ". " + book);
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.getTitle() + ", Year: " + book.getPublicationYear());
            }
        }
    }

    public boolean borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                user.borrowBook(book);
                return true;
            }
        }
        return false;
    }

    public void returnBook(Book book, User user) {
        books.add(book);
        user.returnBook(book);
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) return 0;
        double total = 0;
        int count = 0;
        for (Book book : books) {
            total += book.getRating();
            count++;
        }
        return count == 0 ? 0 : total / count;
    }

    public Book getMostReviewedBook() {
        Book mostReviewed = null;
        int maxReviews = 0;
        for (Book book : books) {
            if (book.getReviews().size() > maxReviews) {
                maxReviews = book.getReviews().size();
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}

// Main class to demonstrate the functionality of the library system
public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book b1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book b2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book b3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        // Set ratings
        b1.setRating(4.5);
        b2.setRating(4.0);
        b3.setRating(4.8);

        // Add reviews
        b2.addReview("Excellent explanation of algorithms.");
        b2.addReview("Very helpful for beginners.");
        b3.addReview("A masterpiece in fiction writing.");

        // Add books to library
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Display all books
        library.displayBooks();

        // Find books by author
        library.findBooksByAuthor("Jane Doe");

        // Create user
        User user = new User("Miska Voutilainen", 30);
        library.addUser(user);

        // Borrow a book
        System.out.println("\nBorrowing 'Data Structures and Algorithms':");
        if (library.borrowBook("Data Structures and Algorithms", user)) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }

        // Check availability
        System.out.println("\nIs 'Data Structures and Algorithms' available? " + library.isBookAvailable("Data Structures and Algorithms"));

        // Return the book
        System.out.println("\nReturning the book...");
        library.returnBook(b2, user);

        // Check availability again
        System.out.println("Is 'Data Structures and Algorithms' available? " + library.isBookAvailable("Data Structures and Algorithms"));

        // Display statistics
        System.out.println("\nAverage Book Rating: " + library.getAverageBookRating());
        System.out.println("Most Reviewed Book: " + library.getMostReviewedBook());
    }
}
