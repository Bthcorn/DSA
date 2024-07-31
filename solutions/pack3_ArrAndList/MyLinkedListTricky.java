package solutions.pack3_ArrAndList;

public class MyLinkedListTricky extends MyLinkedList {
  public void q1_rotate_clockwise(int k) {
    
    while (k > 0) {
      Node q = head;
      while (q.next.next != null) {
        q = q.next;
      }
      q.next.next = head;
      head = q.next;
      q.next = null;
      k--;
    }
    // Node p = head;
    // Node q = head;
    // while (k > 0) {
    //   q = p;
    //   while (q.next != null) {
    //     q = q.next;
    //   }
    //   q.next = p;
    //   head = p.next;
    //   p.next = null;
    //   p = head;
    //   k--;
    // }
  }

  public void q2_reverse() {
    Node p = head;
    Node q = null;
    Node r = null;
    while (p != null) {
      r = q;
      q = p;
      p = p.next;
      q.next = r;
    }
    head = q;

    // next = cur.next
    // cur.next = prev
    // prev = cur
    // cur = next
  }

  // brute force: try every possible pair of nodes
  public void q3_remove_dup() {
    Node p = head;
    while (p != null) { // p keeps going
      Node q = p;
      while (q.next != null) {
        if (p.data == q.next.data) {
          q.next = q.next.next;
        } else {
          q = q.next;
        }
      }
      p = p.next;
    }
  }

  public void q4_add_one() {
    Node p = head;
    Node q = null;
    while (p != null) {
      if (p.data != 9) {
        q = p;
      }
      p = p.next;
    }
    if (q == null) {
      q = new Node(0);
      q.next = head;
      head = q;
    }
    q.data++;
    p = q.next;
    while (p != null) {
      p.data = 0;
      p = p.next;
    }

    //or reverse first then add one then reverse back with carry

  }
  
  public boolean q5_isPalindrome() {
    Node p = head;
    q2_reverse();
    //or in case for loop using with size()
    Node q = head;
    while (p != null) {
      if (p.data != q.data) {
        return false;
      }
      p = p.next;
      q = q.next;
    }
    return true;
    }
    //   Node p = head;
  //   Node q = head;
  //   while (q != null && q.next != null) {
  //     p = p.next;
  //     q = q.next.next;
  //   }
  //   Node r = null;
  //   Node s = null;
  //   while (p != null) {
  //     s = r;
  //     r = p;
  //     p = p.next;
  //     r.next = s;
  //   }
  //   p = head;
  //   while (r != null) {
  //     if (p.data != r.data) {
  //       return false;
  //     }
  //     p = p.next;
  //     r = r.next;
  //   }
  //   return true;
  // }

}
