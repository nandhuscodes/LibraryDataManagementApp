class LibraryItem{
    private int id; //id is alphanumeric
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
    String author;
    public void printBook(int id, String title, int year, String author){
        System.out.println(id+" "+title+" "+year+" "+author);
    }
}
class Magazine extends LibraryItem{
    int issue;
    public void printMagazine(int id, String title, int year, int issue){
        System.out.println(id+" "+title+" "+year+" "+issue);
    }
}
public class LibraryDataManagementApp {
    public static void main(String[] args) {
        Book alchemist = new Book();
        alchemist.setId(101);
        alchemist.title = "The Alchemist";
        alchemist.year = 1940;
        alchemist.author = "Paul";
        alchemist.printBook(alchemist.getId(), alchemist.title, alchemist.year, alchemist.author);
        Magazine fortNight = new Magazine();
        fortNight.setId(202);
        fortNight.title = "The FortNight";
        fortNight.year = 2022;
        fortNight.issue = 12;
        fortNight.printMagazine(fortNight.getId(), fortNight.title, fortNight.year, fortNight.issue);
    }
}