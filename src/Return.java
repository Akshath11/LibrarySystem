public class Return
{
    Customers customs ;
    Order o;

    public Return(Customers customers , Order o)
    {
        this.customs = customers;
        this.o = o;
        o.setBook_Returned(true);
        o.getBookOrder().issued = false;
        FindPrice(o , customers);
    }

    public void FindPrice(Order o , Customers customers)
    {
        int priceofbook = (o.getBookOrder().getPrice()) / 100;
        int days = 13;

        customers.setBalance(customers.getBalance() + (priceofbook * days));

    }





}
