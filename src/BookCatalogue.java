public class BookCatalogue
{
    private Book book;
    int location;


    public BookCatalogue(Book book, int location)
    {
        this.book = book;
        this.location = location;
    }

    public int getLocationOfTheBook()
    {
        return location;
    }

    public void setLocationOfTheBook(int location)
    {
        this.location = location;
    }

    public Book getBooks()
    {
        return book;
    }
}
