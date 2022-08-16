import java.util.ArrayList;
import java.util.Scanner;

public class Customers
{
    private String Name;
    private int UniqueId;
    private int Phone_Number;
    private String Address;
    private int balance;
    private ArrayList<Order> Orders;

    public Customers(String name, int uniqueId, int phone_Number, String address)
    {
        Name = name;
        UniqueId = uniqueId;
        Phone_Number = phone_Number;
        Address = address;
        this.balance = 0;
    }

    public String getName()
    {
        return Name;
    }

    public int getUniqueId()
    {
        return UniqueId;
    }

    public int getPhone_Number()
    {
        return Phone_Number;
    }

    public String getAddress()
    {
        return Address;
    }

    public int getBalance()
    {
        return balance;
    }

    public ArrayList<Order> getOrders()
    {
        return Orders;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public void setOrdersOrder (Order orde)
    {
        Orders.add(orde);
    }

    public void SearchForMe()
    {
        SearchingSystem ss = new SearchingSystem();
        ss.SearchBook();
    }
    public void IssueForMe()
    {
        System.out.println("Please enter the name of the book : ");
        Scanner sc = new Scanner(System.in);
        String book = sc.next();


        Issue is = new Issue(SearchBookInCatalogue(book) , this , 11082000 , 5565 );
    }

    private Book SearchBookInCatalogue(String book)
    {
        SearchingSystem ss = new SearchingSystem();
        return (ss.SearchBook());
    }

    public void ReturnForMe()
    {
        Scanner sc = new Scanner(System.in);
        String NameOfBookForReturn = sc.next();
        ArrayList<Order> oo = this.getOrders();

        for(Order oooo : oo)
        {
           if(oooo.getBookOrder().equals(NameOfBookForReturn))
           {
               new Return(this , oooo);
           }
        }
    }

    public void FineForMe()
    {
        Fine newFine = new Fine(this , this.balance);
    }

}

