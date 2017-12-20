
package kavitajavaclass;

import java.util.LinkedList;

class Person
{
    
}
class A extends Person
{}
class TestQueue<T extends Person>
{
    public LinkedList<T> items=new LinkedList<>();
    
    public void enqueue(T item)
    {
        items.addLast(item);
    }
    public T dequeue()
    {
        return items.removeFirst();
    }
}
public class KavitaJavaClass
{
       public static void main(String[] args) 
       {
                 TestQueue<A> ob=new TestQueue<>();
       }
    
}
