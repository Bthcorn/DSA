
package solutions.pack3_ArrAndList;

/**
 * MyArrayBasic
 */
public class MyArrayBasic {
  protected int MAX_SIZE = 5;
  protected int data[] = new int[MAX_SIZE];
  protected int size = 0;

  public MyArrayBasic() {
  }

  public MyArrayBasic(int... a) {
    MAX_SIZE = a.length;
    data = new int[MAX_SIZE];
    for (int i = 0; i < a.length; i++) {
      this.data[i] = a[i];
      size++;
    }
  }

  public void add(int d) {
    data[size++] = d;
  }

  public void insert(int d, int index) {
   for (int i = size; i > index; i--) {
      data[i] = data[i - 1];
    }
    data[index] = d;
    size++;
  }

  public int find(int d) {  
    for (int i = 0; i < size; i++) {
      if (data[i] == d) {
        return i;
      }
    }
    return -1;
  }

  public int binarySearch(int d) {
    int a = 0;
    int b = size - 1;
    while (a <= b) {
      int m = (a + b) / 2;
      if (data[m] == d) {
        return m;
      }
      if (d < data[m]) {
        b = m - 1;
      } else {
        a = m + 1;
      }
    }
    return -1;
  }
  
  public void delete(int index) {
    for (int i = index; i < size - 1; i++) {
      data[i] = data[i + 1];
    }
    size--;
  }
  
}