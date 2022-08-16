
import java.util.ArrayList;
import java.util.Scanner;

public class SearchingSystem
{

    public Book SearchBook()
    {
        Book booksbyname = null;
        Search BookSearch ;
        System.out.println("SearchBook By : ");
        Scanner sc = new Scanner(System.in);
        String searchAnswer = sc.next();
        String Searching = sc.next();

        if(searchAnswer.toLowerCase().equals("author"))
        {
            BookSearch = new SearchByAuthors(Searching);

        }

        else if(searchAnswer.toLowerCase().equals("name"))
        {
            BookSearch = new SearchByName(Searching);
            booksbyname = BookSearch.getThatSpecificBook();
           // Book booksbyname = new SearchByName(Searching).SearchBook();

        }

        else if(searchAnswer.toLowerCase().equals("genre"))
        {
            Genre G[] = Genre.values();
            for(Genre g : G)
            {
                if(g.equals(Searching))
                {
                    BookSearch = new SearchByGenre(g);
                }
            }
        }
        return booksbyname;
    }
}
