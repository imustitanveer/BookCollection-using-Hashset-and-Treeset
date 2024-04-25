# Book Collection Management

This Java program implements a basic book collection using HashSet and TreeSet data structures. It allows users to add books, remove them, and search for books by title.

## Features
- **Add Book:** Add a book to the collection.
- **Remove Book:** Remove a book from the collection.
- **Search Book:** Search for a book by title.
- **Display Books:** Display the books in both HashSet and TreeSet.

## HashSet vs TreeSet
- **HashSet:** Provides constant-time performance for basic operations but does not maintain element order. It's suitable for fast insertion, deletion, and lookup.
- **TreeSet:** Maintains elements in sorted order with logarithmic-time performance. It's ideal for ordered collections with unique elements.

## Usage
1. Compile the Java file `BookCollection.java`.
2. Run the compiled Java class `BookCollection`.
3. The program demonstrates adding books to the collection, searching for books, and displaying books in both HashSet and TreeSet.

## Implementation Details
- The program utilizes HashSet and TreeSet to store the collection of books.
- Books are added to both HashSet and TreeSet to demonstrate the difference in ordering.
- Methods are provided to add, remove, search, and display books.
- The main method demonstrates adding books, searching for books by title, and displaying the collection.

## Note
Choose HashSet for fast operations without maintaining order and TreeSet for maintaining elements in sorted order. This distinction allows flexibility based on the requirements of the application.
