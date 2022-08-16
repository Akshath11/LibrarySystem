import java.util.ArrayList;

public class Shelf
{
    private ArrayList<BookCatalogue> shelves;

    public Shelf(ArrayList<BookCatalogue> shelves)
    {
        this.shelves = shelves;
    }

    public ArrayList<BookCatalogue> getShelves()
    {
        return shelves;
    }

    public void setShelves(ArrayList<BookCatalogue> shelves)
    {
        this.shelves = shelves;
    }
}
