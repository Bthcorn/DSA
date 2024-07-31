package solutions.pack3_ArrAndList;

public class MyLinkedList {
  public class Node {
    int data;
    Node next;

    public Node(int d) {
      data = d;
    }
  }

  Node head = null;

  public int GetAt(int i) {
    Node p = head;
    while (i > 0) {
      p = p.next;
      i--;
    }
    return p.data;
  }

  public void SetAt(int d, int i) {
    Node p = head;
    while (i > 0) {
      p = p.next;
      i--;
    }
    p.data = d;
  }

  public void add(int d) {
    Node p = new Node(d);
    p.next = head;
    head = p;
  }

  public void add(int[] d) {
    for (int i = d.length - 1; i >= 0; i--) {
      add(d[i]);
    }
  }

  public void insert(int d) {
    Node q = new Node(d);
    Node p = head;
    if (p == null) {
      head = q;
      return;
    }

    if (p.data > d) {
      q.next = p;
      head = q;
      return;
    }

    while ((p.next != null) && (p.next.data < d)) {
      p = p.next;
    }
    q.next = p.next;
    p.next = q;
  }

  public void insert(int[] d) {
    for (int i = 0 ; i < d.length; i++) {
      insert(d[i]);
    }
  }

  public int size() {
    Node p = head;
    int size = 1;
    if (p == null) {
      return 0;
    }

    while (p.next != null) {
      p = p.next;
      size++;
    }
    return size;
  }

  public void delete(int d) {
    Node t = new Node(0);
    t.next = head;
    Node p = t;
    while ((p.next != null) && (p.next.data != d)) {
      p = p.next;
    }

    if (p.next != null) {
      p.next = p.next.next;
    }
    head = t.next;
  }

  public int find(int d) {
    Node p = head;
    int i = 0;
    if (p.data == d) {
      return i;
    }
    while ((p.next != null)) {
      p = p.next;
      i++;

      if (p.data == d) {
        return i;
      }
    }
    return -1;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("head");
    Node p = head;
    while (p != null) {
      sb.append("->(");
      sb.append(p.data);
      sb.append(")");
      p = p.next;
    }
    sb.append("->null");
    return new String(sb);
  }
}
