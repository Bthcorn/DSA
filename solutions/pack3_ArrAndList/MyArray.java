package solutions.pack3_ArrAndList;

public class MyArray extends MyArrayBasic {

  public MyArray() {
    super();
    MAX_SIZE = 100_000;
    data = new int[MAX_SIZE];
  }

  public MyArray(int size) {
    MAX_SIZE = size;
    data = new int[MAX_SIZE];
  }

  boolean isFull() {
    return size == MAX_SIZE;
  }

  boolean isEmpty() {
    return size == 0;
  }

  public void add(int d) {
    if (isFull()) {
      expand();
      // System.out.println("Expanded to " + MAX_SIZE);
    }
    super.add(d);
  }

  public void insert(int d, int index) {
    if (isFull()) {
      expand();
    }
    super.insert(d, index);
  }

  public void delete(int index) {
    if (isEmpty() || index < 0 || index >= size) {
      return;
    }

    for (int i = index; i < size - 1; i++) {
      data[i] = data[i + 1];
    }
    size--;
  }

  int [] expandByK(int k) {
    MAX_SIZE *= k;
    int [] newData = new int[MAX_SIZE];
    System.arraycopy(data, 0, newData, 0, size);
    data = newData;
    return data;
  }

  int [] expand() {
    return expandByK(2);
  }

}
