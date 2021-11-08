package Laboratorna_2.Task2;

public class LinkedList<T> implements Stack<T> {
    private Node node;
    private int size = 0;

    public LinkedList() {

    }

    public Node getNode() {
        return node;
    }

    public void setNode(final Node node) {
        this.node = node;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    @Override
    public void add(final T value) {
        final Node<T> newNode = new Node(value, node);
        newNode.setNext(node);
        node = newNode;
        size++;
    }

    @Override
    public void delete(final int index) {
        Node tmp = node;
        Node prev = null;
        if (tmp == null) {
            return;
        }
        if (tmp.getData().equals (index)){
            node = tmp.getNext();
            return;
        }
        while (tmp != null && !(tmp.getData().equals (index)) ) {
            prev = tmp;
            tmp = tmp.getNext();

        }
        size--;
        if (tmp == null) {

            return;

        }
        prev.setNext(tmp.getNext());

    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }
    @Override
    public int size() {

        return size;

    }

    @Override
    public T get() throws RuntimeException{

        if (node == null){
            throw new RuntimeException("Node null");
        }

        final T i = (T) node.getData ();
        node = node.getNext();
        size--;
        return i;
    }

    @Override
    public void clear() {
        try {
            Node<T> current = node;
            while (current != null) {
                current.setData (null);
                current = current.getNext ();
            }
            this.node  = new Node(null,null);
            isEmpty ();
            System.gc();
        } catch (final Exception e) {
            System.out.println (e.getMessage ());
        }
    }

    @Override
    public void read() {
        Node<T> headPointer = node;

        if (node == null){
            System.out.println("null");
        }
        while (headPointer.getNext() != null){
            System.out.println(headPointer.getData ());
            headPointer = headPointer.getNext();
        }
        System.out.println(headPointer.getData ());
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "node=" + node +
                ", size=" + size +
                '}';
    }
}
