public class ArrayList<T> implements List<T> {
    private static final int NOT_FOUND_INDEX = -1;
    private T[] array;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int initialSize) {
        array =(T[]) new Object[initialSize];
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
        growAsNeeded();
        array[size++] = item;
    }

    private void growAsNeeded() {
        if (size == array.length) {
            T[] newArray =(T[]) new Object[(array.length * 3) / 2 + 1];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
//            array = Arrays.copyOf(array, (array.length * 3) / 2 + 1);
        }
    }

    @Override
    public void add(int index, T item) {
        checkForRange(index);
        growAsNeeded();
        shiftItemsToRight(index);
        array[index] = item;
        size++;
    }

    private void shiftItemsToRight(int index) {
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
    }

    @Override
    public T get(int index) {
        checkForRange(index);
        return (T) array[index];
    }

    @Override
    public int indexOf(T obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(array[i])) {
                return i;
            }
        }
        return NOT_FOUND_INDEX;
    }

    @Override
    public int lastIndexOf(T obj) {
        for (int i = size - 1; i >= 0; i--) {
            if (obj.equals(array[i])) {
                return i;
            }
        }
        return NOT_FOUND_INDEX;
    }

    @Override
    public void set(int index, T item) {
        checkForRange(index);
        array[index] = item;
    }

    private void checkForRange(int index) {
        if ((index < 0) && (index > size)) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void remove(int index) {
        shiftItemsToLeft(index);
        array[--size] = null;
    }

    private void shiftItemsToLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    @Override
    public boolean remove(T item) {
        int index = indexOf(item);
        if (index == NOT_FOUND_INDEX) {
            return false;
        } else {
            remove(index);
            return true;
        }
    }

    @Override
    public List subList(int from, int to) {
        checkForRange(from, to);
        List subList = new ArrayList(to - from);
        for (int i = from; i < to; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    private void checkForRange(int from, int to) {
        if ((from > to) || (from < 0) || (to > size)) {
            throw new IndexOutOfBoundsException();
        }
    }
}
