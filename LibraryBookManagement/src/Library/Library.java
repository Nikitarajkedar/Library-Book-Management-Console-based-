package Library;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
        System.out.println(" Book added!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("📭 No books found.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void searchBook(String title) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println(" Found: " + b);
                found = true;
                break;
            }
        }
        if (!found) System.out.println(" Book not found.");
    }

    public void deleteBook(String title) {
        books.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
        System.out.println("🗑️ Book deleted if it existed.");
    }
}
