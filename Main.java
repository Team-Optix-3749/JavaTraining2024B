public class Main {
    public static void main(String[] args) {
        Library libby = new Library();

        // Instantiates 2 new books
        Book book1 = new Book("Book1", "Someone", Genre.FANTASY);
        Book book2 = new Book("Book2", "Someone", Genre.FANTASY);

        // Adds books to shelves
        libby.addBook(book1); 
        libby.addBook(book2);

        libby.search(book1); // Should give me the shelf its on
    }
}