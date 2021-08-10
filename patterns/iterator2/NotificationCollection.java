// Collection of notifications
class NotificationCollection implements Collection
{
    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    Notification[] notificationList;
  
    public NotificationCollection()
    {
        notificationList = new Notification[MAX_ITEMS];
  
        // Let us add some dummy notifications
        addItem("Notification A");
        addItem("Notification B");
        addItem("Notification C");
    }
  
    public void addItem(String str)
    {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("ERROR: The collection is full!");
        else
        {
            notificationList[numberOfItems] = notification;
            numberOfItems++;
        }
    }
  
    public Iterator createIterator()
    {
        return new NotificationIterator(notificationList);
    }
}