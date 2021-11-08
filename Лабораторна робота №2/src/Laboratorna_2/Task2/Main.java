package Laboratorna_2.Task2;

public class Main {
    public static void main(String[] args) {
        final Node<Integer> node1 = new Node<> (10,null);
        final Node<Integer> node2 = new Node<> (11,node1);
        final Node<Integer> node3 = new Node<> (12,node2);
        final Node<Integer> node4 = new Node<> (13,node3);

        final LinkedList<Integer> stack = new LinkedList<> ();
        System.out.println("Stack size before adding " + stack.size());
        stack.add (50);
        stack.add (60);
        stack.add(70);
        stack.add(80);
        stack.add (90);
        stack.add (100);
        stack.add (200);
        stack.read ();

        System.out.println("Stack size after adding " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());

        stack.delete (80);
        System.out.println ("Delete 80");

        stack.read ();
        System.out.println("Stack size after delete " + stack.size());
        System.out.println("\nGet Stack: " + stack.get());
        System.out.print ("Clear stack = ");
        stack.clear ();
        stack.read ();
    }
}
