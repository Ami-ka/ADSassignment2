import java.util.Iterator;

public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private int size = 0;
    private int capacity = 5;
    Object[] array;

    MyArrayList() {
        array = new Object[capacity];
    }

    @Override
    public void add(T item) {
        if (size == capacity) {
            increaseBuffer();
        }

        array[size++] = item;

    }

    private void increaseBuffer() {

        capacity = (int) (capacity * 1.5);
        Object[] array2 = new Object[capacity];

        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    @Override
    public void add(int index, T item) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("index"+index+"out of array range");
        }

        if(size == capacity){
            increaseBuffer();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = item;
        size++;
    }

    @Override
    public void set(int index, T item) {
        array[index] = item;
    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public T getFirst() {
        return get(0);
    }

    @Override
    public T getLast() {
        return get(size - 1);
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("index"+index+"out of array range");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    @Override
    public void removeLast() {
        remove(size - 1);
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                T current = (T) array[j];
                T next = (T) array[j + 1];
            
                if (((Comparable<T>) current).compareTo(next) > 0) {
                    array[j] = next;
                    array[j + 1] = current;
                }
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i] == object) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int index = -1;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] == object) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean exists(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i] == object) {
                return true;
            }

        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size - 1; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}