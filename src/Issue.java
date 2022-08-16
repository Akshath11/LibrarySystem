public class Issue
{
    Order newOrder;
    Customers name;

    public Issue(Book book , Customers customer , int date , int id)
    {
        newOrder = new Order(book , date , id);
        customer.setOrdersOrder(newOrder);
        book.issued = true;
        book.setIssuingCustomers(customer);
        System.out.println("Book Issued");

    }

    public void AddPrice(Customers customer,Book book)
    {
        int priceofbook = book.getPrice() / 100;

    }



}
