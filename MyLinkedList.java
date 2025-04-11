import java.util.Iterator;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {

    int size;
    private MyNode<T> head;
    private MyNode<T> tail;

    MyLinkedList() {
    }


    private class MyNode<E> {

        E data;
        MyNode<E> next;
        MyNode<E> previous;

        MyNode(E data) {
            this.data = data;
        }

    }


    @Override
    public void add(T item) {

        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }


    @Override
    public void add(int index, T item) {

        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        MyNode<T> newNode = new MyNode<>(item);

        if (index == 0) {
            addFirst(item);
            return;
        } else if (index == size) {
            addLast(item);
            return;
        }

        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newNode.previous = current.previous;
        newNode.next = current;
        current.previous.next = newNode;
        current.previous = newNode;
        size++;

    }


    @Override
    public void addFirst(T item) {

        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;

    }


    @Override
    public void addLast(T item) {

        add(item);

    }


    @Override
    public void clear() {

        MyNode<T> current = head;
        while (current != null) {
            MyNode<T> next = current.next;
            current.next = null;
            current.previous = null;
            current = next;
        }
        head = tail = null;
        size = 0;

    }


    @Override
    public boolean exists(Object object) {

        MyNode<T> current = head;
        while (current != null) {
            if (current.data.equals(object)) {
                return true;
            }
            current = current.next;
        }
        return false;

    }


    @Override
    public T get(int index) {
        
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;

    }


    @Override
    public T getFirst() {

        if (head == null) throw new IllegalStateException("List is empty");
        return head.data;
    }


    @Override
    public T getLast() {

        if (tail == null) throw new IllegalStateException("List is empty");
        return tail.data;
    }


    @Override
    public int indexOf(Object object) {

        MyNode<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(object)) return index;
            current = current.next;
            index++;
        }
        return -1;

    }


    @Override
    public int lastIndexOf(Object object) {
        MyNode<T> current = tail;
        int index = size - 1;
        while (current != null) {
            if (current.data.equals(object)) return index;
            current = current.previous;
            index--;
        }
        return -1;
    }


    @Override
    public void remove(int index) {

        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }

        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;
        size--;

    }


    @Override
    public void removeFirst() {

        if (head == null) return;
        head = head.next;
        if (head != null) head.previous = null;
        else tail = null;
        size--;

    }


    @Override
    public void removeLast() {

        if (tail == null) return;
        tail = tail.previous;
        if (tail != null) tail.next = null;
        else head = null;
        size--;

    }


    @Override
    public void set(int index, T item) {

        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void sort() {
        if (size < 2) return;

        for (MyNode<T> i = head; i != null; i = i.next) {
            for (MyNode<T> j = i.next; j != null; j = j.next) {
                if (i.data.compareTo(j.data) > 0) {
                    T temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        MyNode<T> current = head;
        int i = 0;
        while (current != null) {
            array[i++] = current.data;
            current = current.next;
        }
        return array;
    }

    
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}
