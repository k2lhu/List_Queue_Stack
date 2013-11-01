/**
 * Created with IntelliJ IDEA.
 * User: iromeo
 * Date: 28.10.13
 * Time: 22:05
 * To change this template use File | Settings | File Templates.
 */

class Item {

    public int value;
    public Item next;

    public Item(int value)
    {
        this.value = value;
    }

    public void DisplayItem()
    {
      System.out.print("{" + value + "}");
    }

}

class MyList {

    private Item first;

    public MyList()
    {
        first = null;
    }

    public void InsertFirst(int id)
    {
        Item newLink = new Item(id);

        newLink.next = first;
        first = newLink;
    }

    public Item Delete()
    {
        Item temp = first;
        first = first.next;

        return temp;
    }

    public boolean isEmpty()
    {
        return (first == null);
    }

    public void DisplayList()
    {
        System.out.print("MyList (first-->last): ");

        Item current = first;

        while(current != null)
        {
            current.DisplayItem();
            current = current.next;
        }
        System.out.println("");
    }

}
