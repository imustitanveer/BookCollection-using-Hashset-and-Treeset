// This code implements a basic book Collection using Hashset and Treeset
// it can add books, remove them and search them by author or date

import java.util.HashSet;
import java.util.TreeSet;

// public class of book collection
public class BookCollection {
    // initializing hashset and treeset
    private HashSet<String> hashSetBooks = new HashSet<>();
    private TreeSet<String> treeSetBooks = new TreeSet<>();

    // method to add book
    public void addBook(String title) {
        hashSetBooks.add(title);
        treeSetBooks.add(title);
    }

    // method to remove book
    public void removeBook(String title) {
        hashSetBooks.remove(title);
        treeSetBooks.remove(title);
    }

    // method to search book
    public boolean searchBook(String title) {
        return hashSetBooks.contains(title);
    }

    //method to display hashset books
    public void displayHashSetBooks() {
        System.out.println("Books in HashSet:");
        // iteratively print out the books
        for (String book : hashSetBooks) {
            System.out.println(book);
        }
    }

    // method to display treeset books
    public void displayTreeSetBooks() {
        System.out.println("Books in TreeSet:");
        // iteratively print out the books
        for (String book : treeSetBooks) {
            System.out.println(book);
        }
    }

    // main function
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        // adding books
        collection.addBook("The Great Gatsby");
        collection.addBook("To Kill a Mockingbird");
        collection.addBook("1984");
        collection.addBook("The Catcher in the Rye");

        // searching books by year
        System.out.println("Searching for '1984' in HashSet: " + collection.searchBook("1984"));
        // searching book by author
        System.out.println("Searching for 'Moby Dick' in TreeSet: " + collection.searchBook("Moby Dick"));

        // displaying collection
        collection.displayHashSetBooks();
        collection.displayTreeSetBooks();
    }
}

/* HashSet provides constant-time performance for basic operations 
but does not maintain element order, suitable for fast insertion, deletion, and lookup. 
TreeSet maintains elements in sorted order with logarithmic-time performance, 
ideal for ordered collections with unique elements. 
Choose HashSet for fast operations without order and TreeSet for ordered collections. */
