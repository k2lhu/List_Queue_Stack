/**
 * Created with IntelliJ IDEA.
 * User: iromeo
 * Date: 28.10.13
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 */

public class MyQueue {

    private int maxSize;
    private int[] queArray;
    private int head, tail;

    public MyQueue(int maxSize)
    {
        queArray = new int[this.maxSize = maxSize];
    }

    public void Insert(int value)
    {
        if(++tail == maxSize)
            tail = 0;
        queArray[tail] = value;

    }

    public int Remove()
    {
        if(++head == maxSize)
        {
            head = 0;
        }

        return (queArray[head]);
    }

    public boolean isEmpty()
    {
        return head == tail ;
    }

//    public int Size()
//    {
//        return numItems;
//    }


}

