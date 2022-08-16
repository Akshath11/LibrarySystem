import java.util.ArrayList;

public class Fine
{
    Customers customr;
    int value;

    public Fine(Customers customr , int value )
    {
        this.customr = customr;
        this.value = value;
        System.out.println(FindAllUnreturnedBooks(customr.getOrders() , customr.getBalance()));
    }

    public static int FindAllUnreturnedBooks(ArrayList<Order> on , int bal)
    {
        int current_val = bal;
        for(Order iter : on)
        {
            if(iter.isBook_Returned() == false)
            {
                if(iter.getDate_Issued() > 10)
                {
                    current_val = current_val + (iter.getBookOrder().getPrice()/100);
                }
            }
        }

        return current_val;
    }

}
