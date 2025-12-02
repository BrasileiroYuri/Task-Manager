import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Heap<T extends Comparable<T>> {
  private final List<T> data = new ArrayList<>();

  public void push(T elem) {
    data.add(elem);
    percolateUp(data.size() - 1);
  }

  public T top() {
    if (data.isEmpty())
      throw new NoSuchElementException("Heap is empty");
    return data.get(0);
  }

  public void pop() {
    if (data.isEmpty())
      throw new NoSuchElementException("Heap is empty");
    int lastIdx = data.size() - 1;
    if (lastIdx == 0) {
      data.remove(lastIdx);
      return;
    }
    T last = data.remove(lastIdx);
    data.set(0, last);
    percolateDown(0);
  }

  public int size() {
    return data.size();
  }

  private void percolateUp(int id) {
    while (id > 0) {
      int parent = (id - 1) / 2;
      if (data.get(id).compareTo(data.get(parent)) <= 0)
        break;
      Collections.swap(data, id, parent);
      id = parent;
    }
  }

  private void percolateDown(int id) {
    int n = data.size();
    while (true) {
      int left = 2 * id + 1;
      int right = 2 * id + 2;
      int largest = id;

      if (left < n && data.get(left).compareTo(data.get(largest)) > 0)
        largest = left;
      if (right < n && data.get(right).compareTo(data.get(largest)) > 0)
        largest = right;

      if (largest == id)
        break;
      Collections.swap(data, id, largest);
      id = largest;
    }
  }

  public void print() {
    for (int i = 0; i < data.size(); ++i) {
      System.out.println(i + " " + data.get(i));
    }
  }
}
