import java.util.NoSuchElementException;

public class LinkedList implements Deque, List {
    private Node first;
    private Node last;
    private int size = 0;

    private static class Node {
        private Object item;
        private Node next;
        private Node prev;

        private Node(Object item, Node next, Node prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
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
    public void add(Object item) {
        if (size == 0) {
            first = last = new Node(item, null, null);
        } else {
            first = new Node(item, first, null);
            first.next.prev = first;
//            first.getNext().setPrev(first);
        }
        ++size;
    }

    @Override
    public void add(int index, Object item) {

    }

    @Override
    public Object get(int index) {
        checkForRange(index);
        Node current = first;
        for (int i = 0; i < index; ++i) {
            current = current.next;
        }
        return current.item;
    }

    private void checkForRange(int index) {
        if ((index < 0) || (index >= size))
            throw new NoSuchElementException();
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public void set(int index, Object item) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public List subList(int from, int to) {
        return null;
    }

    @Override
    public void addFirst(Object item) {

    }

    @Override
    public void addLast(Object item) {

    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object getFirst() {
        return null;
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public Object pollFirst() {
        return null;
    }

    @Override
    public Object pollLast() {
        return null;
    }
}
