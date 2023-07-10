import java.util.HashMap;
import java.util.Scanner;
class LibraryItem{
    private int id;
    String title;
    int year;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
class Book extends LibraryItem{
    HashMap<Integer, String> bk = new HashMap<>();
    String author;
    int i = 1;
    public void addBkDetail(){
        bk.put(i, "Author name: "+author+"\nBook Title: "+title+"\nBook ID: "+getId()+"\nPublication year: "+year);
        i++;
    }
    public void printLastIssuedBook(){
        System.out.println(bk.get(bk.size()));
    }
}
class Magazine extends LibraryItem{
    HashMap<Integer, String> mag = new HashMap<>();
    int issue = 0, i = 1;
    public void addMagDetail(){
        mag.put(i, "Number of issues: "+issue+"\nMagazine Title: "+title+"\nMagazine ID: "+getId()+"\nPublication year: "+year);
        i++;
    }
    public void printLastIssuedMagazine(){
        System.out.println(mag.get(mag.size()));
    }
}
public class LibraryDataManagementApp {
    public static void main(String[] args) {
        int choice = 0;
        Book book = new Book();
        Magazine magazine = new Magazine();
        Scanner scanner = new Scanner(System.in);
        while (choice>=0){
            System.out.println("\n\n\tWhat function do you want to perform?\n1.) Load books detail of particular author\n2.) Issues particular book\n3.)Last issued book\n4.)Last issued magazine\n\n");
            System.out.print("Enter your choice (1 to 4) or -1 to exit: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter author name: ");
                    book.author = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    book.setId(scanner.nextInt());
                    System.out.print("Enter Book title: ");
                    scanner.nextLine();
                    book.title = scanner.nextLine();
                    System.out.print("Enter year of publication: ");
                    book.year = scanner.nextInt();
                    System.out.println("Book Loaded to DataBase successfully");
                    book.addBkDetail();
                }
                case 2 -> {
                    System.out.print("Enter Magazine title: ");
                    scanner.nextLine();
                    magazine.title = scanner.nextLine();
                    System.out.print("Do you want to issue it (y/n): ");
                    char ch = scanner.next().charAt(0);
                    if (ch == 'y') {
                        magazine.issue++;
                    }
                    System.out.print("Enter Magazine ID: ");
                    magazine.setId(scanner.nextInt());
                    System.out.print("Enter Magazine publication year: ");
                    magazine.year = scanner.nextInt();
                    System.out.println("Magazine issued successfully");
                    magazine.addMagDetail();
                }
                case 3 -> book.printLastIssuedBook();
                case 4 -> magazine.printLastIssuedMagazine();
            }
        }
        scanner.close();
    }
}
