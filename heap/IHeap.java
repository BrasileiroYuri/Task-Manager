package heap;

public interface IHeap<T extends Comparable<T>> {
    void push(T elem);
    void pop();
    T top();
    int size();
    void print();
}