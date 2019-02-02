package edu.isu.cs.cs3308.structures.impl;
import edu.isu.cs.cs3308.structures.Queue;

public class LinkedQueue<E> implements Queue<E>
{

    public class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next){
            this.value = value;
        }

        public void setNext(Node<E> next){
            this.next = next;
        }

        public Node<E> getNext(){
            return next;
        }

        public E getValue(){
            return value;
        }
    }

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public LinkedQueue()
    {
        first = null;
        last = null;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void offer(E element)
    {
        Node<E> old = last;
        last = new Node(element, null);

        if(isEmpty())
        {
            first = last;
        }
        else
        {
            old.next = last;
        }
        size++;
    }

    public E peek()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            return first.getValue();
        }
    }

    public E poll()
    {
        if(isEmpty())
        {
            return null;
        }
        E removed = first.getValue();
        first = first.next;
        size--;
        if(isEmpty())
        {
            last = null;
        }
        return removed;
    }

    public void printQueue()
    {
        Node<E> current = first;
        for(int i = 0; i < size; i++)
        {
            System.out.println(current.getValue());
            current = current.next;
        }
    }

    public void transfer(Queue<E> into)
    {

    }

    public void reverse()
    {

    }

    public void merge(Queue<E> from)
    {

    }

}
