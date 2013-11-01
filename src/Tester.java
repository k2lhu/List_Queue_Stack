/**
 * Created with IntelliJ IDEA.
 * User: iromeo
 * Date: 28.10.13
 * Time: 15:47
 * To change this template use File | Settings | File Templates.
 */

class Tester {

    public static void main(String[] args)
    {
        ///// Stack test \\\\\

        MyStack stack = new MyStack(5);

        stack.Push(4);
        stack.Push(10);
        stack.Push(8);
        stack.Push(0);
        stack.Push(3);

        stack.Pop();
        stack.Pop();

        while( !stack.isEmpty() )
        {
            System.out.print(stack.Pop());
            System.out.print(" ");
        }

        System.out.println("");

        ///// Queue test \\\\\

        MyQueue queue = new MyQueue(5);

        queue.Insert(82);
        queue.Insert(3);
        queue.Insert(5);
        queue.Insert(4);
        queue.Insert(7);

        queue.Remove();
        queue.Remove();

        while( !queue.isEmpty() )
        {
            System.out.print(queue.Remove());
            System.out.print(" ");
        }

        System.out.println("");

        ///// List test \\\\\

        MyList newList = new MyList();

        newList.InsertFirst(3);
        newList.InsertFirst(2);
        newList.InsertFirst(4);
        newList.InsertFirst(9);
        newList.InsertFirst(11);

        newList.DisplayList();

        newList.Delete();
        newList.Delete();

        newList.DisplayList();

    }
}
