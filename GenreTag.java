import java.util.ArrayList;

public class GenreTag {
    private ArrayList<String> bookGenres = new ArrayList<>();

    // add a genre
    public void addGenre(String genre) {
        bookGenres.add(genre);
    }

    // search for a genre and print book title if found
    public void searchGenre(String genre, String bookTitle) {
        for (String g : bookGenres) {
            if (g.equalsIgnoreCase(genre)) {
                System.out.println(genre + ": " + bookTitle);
                return;
            }
        }
        System.out.println("Genre not found: " + genre);
    }
}