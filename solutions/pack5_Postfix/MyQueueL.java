package solutions.pack5_Postfix;

public class MyQueueL<T> extends
    MyQueueListWrap<T> {

  public void enqueue(T d) {
    this.add(d);
  }

  public T dequeue() {
    return this.dequeue();
  }

  public T top() {
    return this.top();
  }

  public String dumpToString() {
    StringBuilder sb = new StringBuilder();
    for (T item : this) { // Use the iterator provided by MyQueueListWrap
      sb.append(item);
      sb.append(" ");
    }
    return sb.toString();
  }

  @Override
  public String toString() {
    return dumpToString();
  }
}
