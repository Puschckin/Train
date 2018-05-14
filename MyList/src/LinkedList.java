import java.util.NoSuchElementException;

public class LinkedList<T> implements Deque<T>, List<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    private static class Node<T> {
        private T item;
        private Node<T> next;
        private Node<T> prev;

        private Node(T item, Node<T> next, Node<T> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
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
    public void add(T item) {
        if (size == 0) {
            first = last = new Node<>(item, null, null);
        } else {
            first = new Node<>(item, first, null);
            first.next.prev = first;
//            first.getNext().setPrev(first);
        }
        ++size;
    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public T get(int index) {
        checkForRange(index);
        Node<T> current = first;
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
    public int indexOf(T obj) {
        return 0;
    }

    @Override
    public int lastIndexOf(T obj) {
        return 0;
    }

    @Override
    public void set(int index, T item) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public List subList(int from, int to) {
        return null;
    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }
}
