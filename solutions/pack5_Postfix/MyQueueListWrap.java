package solutions.pack5_Postfix;

import java.util.Iterator;
import java.util.LinkedList;

public class MyQueueListWrap<T> implements Iterable<T> {

  private LinkedList<T> items = new LinkedList<>();
  private int count;

  public void add(T item) {
    items.add(item);
    count++;
  }

  public T get(int index) {
    return items.get(index);
  }

  public T top() {
    return items.getFirst();
  }

  public T getLast() {
    return items.getLast();
  }

  public void enqueue(T item) {
    items.addLast(item);
    count++;
  }

  public T dequeue() {
    if (count == 0) {
      return null;
    }
    count--;
    return items.removeFirst();
  }

  public String dumpToString() {
    StringBuilder sb = new StringBuilder();
    for (T item : this) {
      sb.append(item);
      sb.append(" ");
    }
    return sb.toString();
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public boolean isFull() {
    return false;
  }

  @Override
  public String toString() {
    return dumpToString();
  }

  @Override
  public Iterator<T> iterator() {
    return new AnyItemsIterator(this);
  }

  private class AnyItemsIterator
      implements Iterator<T> {
    private MyQueueListWrap<T> lis;
    private int idx;

    public AnyItemsIterator(MyQueueListWrap<T> arg) {
      this.lis = arg;
    }

    @Override
    public boolean hasNext() {
      return (idx < lis.count);
    }

    @Override
    public T next() {
      return lis.items.get(idx++);
    }
  }
}
