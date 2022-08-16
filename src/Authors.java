import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Authors
{

    private String Name;
    private Genre genre;

    private ArrayList<Book> ListOfBooks;

    public void setListOfBooks(Book Books)
    {
        ListOfBooks.add(Books);
    }

    public ArrayList<Book> getListOfBooks()
    {
        return ListOfBooks;
    }
    public Authors(String name, Genre genre)
    {
        Name = name;
        this.genre = genre;
    }

    public String getName()
    {
        return Name;
    }

    public Genre getGenre()
    {
        return genre;
    }



}
