public class Order
{

    private Book BookOrder;
    private int orderId;
    private int Date_Issued;
    private boolean Book_Returned;

    public Order(Book bookOrder, int date_Issued , int orderId)
    {
        BookOrder = bookOrder;
        Date_Issued = date_Issued;
        Book_Returned = false;
        this.orderId = orderId;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public void setBook_Returned(boolean book_Returned)
    {
        Book_Returned = book_Returned;
    }

    public Book getBookOrder()
    {
        return BookOrder;
    }

    public int getDate_Issued()
    {
        return Date_Issued;
    }

    public boolean isBook_Returned()
    {
        return Book_Returned;
    }

}
