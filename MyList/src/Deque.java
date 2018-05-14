public interface Deque<T> {
    void addFirst(T item);
    void addLast(T item);
    T getFirst();
    T getLast();
    T pollFirst();
    T pollLast();
    T removeFirst();
    T removeLast();
}
