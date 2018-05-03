public interface Deque {
    void addFirst(Object item);
    void addLast(Object item);
    Object getFirst();
    Object getLast();
    Object pollFirst();
    Object pollLast();
    Object removeFirst();
    Object removeLast();
}
