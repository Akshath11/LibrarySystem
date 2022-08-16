import java.util.ArrayList;

public class Book
{
   private String BookNumber;
   private String ISBN ;
   private String Name;
   private Genre genre;
   private int YearOfPublish;
   private ArrayList<Authors> authors;
   private int Price;
   private ArrayList<Customers> IssuingCustomers;
   public boolean issued = false;


   public Book(String bookNumber, String ISBN, String name, Genre genre, int yearOfPublish, ArrayList<Authors> authors, int price)
   {
      BookNumber = bookNumber;
      this.ISBN = ISBN;
      Name = name;
      this.genre = genre;
      YearOfPublish = yearOfPublish;
      this.authors = authors;
      Price = price;
   }

   public String getBookNumber()
   {
      return BookNumber;
   }

   public String getISBN()
   {
      return ISBN;
   }

   public String getName()
   {
      return Name;
   }

   public Genre getGenre()
   {
      return genre;
   }

   public int getYearOfPublish()
   {
      return YearOfPublish;
   }

   public ArrayList<Authors> getAuthors()
   {
      return authors;
   }

   public int getPrice()
   {
      return Price;
   }

   public void setIssuingCustomers(Customers issuingCustomers)
   {
      IssuingCustomers.add(issuingCustomers) ;
   }

   public Book self()
   {
      return this;
   }


}
