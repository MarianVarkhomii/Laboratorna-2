package Laboratorna_2.Task2;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node() {}

    public Node(final T data, final Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
