import java.util.ArrayList;

public class SearchByGenre extends Search
{

    private Genre NameOfGenreToSearch;
    public SearchByGenre(Genre NameOfGenreToSearch)
    {
        this.NameOfGenreToSearch = NameOfGenreToSearch;
        SearchBook();
    }
    private void SearchBook()
    {
        ArrayList<Book> BookListToReturn = new ArrayList<>();
        ArrayList<BookCatalogue> booksForSearching = shelf.getShelves();
        for(BookCatalogue searchBookByName : booksForSearching)
        {
            if(searchBookByName.getBooks().getGenre() == NameOfGenreToSearch)
            {
                BookListToReturn.add(searchBookByName.getBooks());
            }

        }

        System.out.println(BookListToReturn);
    }

    @Override
    Book getThatSpecificBook() {
        return null;
    }
}
