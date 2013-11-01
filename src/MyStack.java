/**
 * Created with IntelliJ IDEA.
 * User: iromeo
 * Date: 28.10.13
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */

public class MyStack {
    private int maxSize;
    private int top;
    private int[] stackArray;


    public MyStack(int s)
    {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void Push(int j)
    {
        if(isFull())
        {
            throw new IndexOutOfBoundsException ("There are too much elements in stack");
        }
        stackArray[++top] = j;
    }

    public int Pop()
    {
        if(isEmpty())
        {
            throw new NullPointerException("There are no elements in stack");
        }
        return stackArray[top--];
    }

//    public int Peek()
//    {
//        return stackArray[top];
//    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize-1);
    }

}
