import java.util.ArrayList;

public class SearchByAuthors extends Search
{

    private String NameOfAuthorsToSearch;
    public SearchByAuthors(String NameOfAuthorsToSearch)
    {
        this.NameOfAuthorsToSearch = NameOfAuthorsToSearch;
        SearchBook();
    }
    private void SearchBook()
    {
        ArrayList<Book> BookListToReturn = new ArrayList<>();
        ArrayList<BookCatalogue> authorsCatalogue = shelf.getShelves();
        for(BookCatalogue searchBookByName : authorsCatalogue)
        {
            ArrayList<Authors> AuthorListToIterate = searchBookByName.getBooks().getAuthors();
            for(Authors aut : AuthorListToIterate)
            {
                if(aut.getName().equals(NameOfAuthorsToSearch))
                {
                    BookListToReturn.add(searchBookByName.getBooks());
                }
            }

        }

        System.out.println(BookListToReturn);
    }

    @Override
    Book getThatSpecificBook() {
        return null;
    }
}
