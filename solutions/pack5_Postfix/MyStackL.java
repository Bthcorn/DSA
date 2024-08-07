package solutions.pack5_Postfix;

public class MyStackL {
  class Node {
    String value;
    Node next;

    public Node(String d) {
      value = d;
      next = null;
    }
  }

  private Node top;

  public MyStackL() {
    top = null;
  }

  public boolean isFull() {
    return false;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public void push(String d) {
    Node temp = new Node(d);
    temp.next = top;
    top = temp;
  }

  public String pop() {
    if (isEmpty()) {
      return null;
    }
    String temp = top.value;
    top = top.next;
    return temp;
  }

  public String peek() {
    if (isEmpty()) {
      return null;
    }
    return top.value;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Top->");
    Node temp = top;
    while (temp != null) {
      sb.append(temp.value).append("->");
      temp = temp.next;
    }
    sb.append("Bottom");
    return sb.toString();
  }
}
