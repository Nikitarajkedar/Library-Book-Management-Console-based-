package Library;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n Library Menu:");
            System.out.println("1. Add Book\n2. View Books\n3. Search Book\n4. Delete Book\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String t = sc.nextLine();
                    System.out.print("Enter author: ");
                    String a = sc.nextLine();
                    System.out.print("Enter year: ");
                    int y = sc.nextInt();
                    lib.addBook(new Book(t, a, y));
                    break;

                case 2:
                    lib.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter title to search: ");
                    lib.searchBook(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter title to delete: ");
                    lib.deleteBook(sc.nextLine());
                    break;

                case 5:
                    System.out.println(" Exiting...");
                    return;

                default:
                    System.out.println("❗ Invalid choice.");
            }
        }
    }
}
