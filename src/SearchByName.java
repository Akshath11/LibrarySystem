
import java.util.ArrayList;

public class SearchByName extends Search
{

    private String NameOfBookToSearch;
    public SearchByName(String NameOfBookToSearch)
    {
        this.NameOfBookToSearch = NameOfBookToSearch;

    }
    public Book SearchBook()
    {
      Book BookListToReturn = null;
      ArrayList<BookCatalogue> booksForSearching = shelf.getShelves();
      for(BookCatalogue searchBookByName : booksForSearching)
      {
         if(searchBookByName.getBooks().getName() == NameOfBookToSearch && searchBookByName.getBooks().issued == false)
         {
             BookListToReturn = searchBookByName.getBooks();
             break;
         }
      }

        return BookListToReturn;
    }

    @Override
    Book getThatSpecificBook() {
        return SearchBook();
    }
}
