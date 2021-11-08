package Laboratorna_2.Task2;

public interface Stack<T> {
    void add(T value);
    void delete(int index);
    boolean isEmpty();
    int size();
    T get();
    void clear();
    void read();
}
