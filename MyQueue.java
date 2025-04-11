public class MyQueue<T extends Comparable<T>> {
    private MyArrayList<T> queue;

    public MyQueue() {
        queue = new MyArrayList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        T item = queue.getFirst();
        queue.removeFirst();
        return item;
    }

    public boolean isEmpty() {
        return (queue.size() == 0);
    }

    public int size(){
        return queue.size();
    }
    
    public T peek(){
        return queue.getFirst();
    }
}
