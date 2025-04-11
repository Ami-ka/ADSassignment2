## MyArrayList
 
 it's my custom dynamic array list 

---


# Features
- Generic type of my Array list
- add elements
- remove elements
- convert to array

# Usage
you can check all of methods in 'Mylist' interface, and for deep understanding of methods logic you can check 'MyArrayList' class   



---

## MyLinkedList

It's my custom doubly-linked list implementation.

---

# Features
- Generic type support (`T extends Comparable<T>`)
- Doubly linked structure (each node has `next` and `previous`)
- Add elements at the beginning, end, or specific index
- Remove elements by index, from beginning or end
- Search for elements (`exists`, `indexOf`, `lastIndexOf`)
- Modify elements (`set`)
- Get elements by index, first, or last
- Sort elements (bubble sort based on `Comparable`)
- Convert to array (`toArray`)
- Clear all elements
- Get current size

---

# Usage

You can find all method declarations in the `MyList<T>` interface.  
For implementation details and logic, check the `MyLinkedList<T>` class.

Supports generic data types that implement `Comparable`, e.g., `Integer`, `String`, `Double`, etc.

---

## MyQueue

It's a custom queue implementation built on top of the `MyArrayList<T>` dynamic array.

---

# Features

- Generic type support (`T extends Comparable<T>`)
- Follows FIFO principle (First-In-First-Out)
- Core queue operations:
  - `enqueue(item)` – add an element to the end
  - `dequeue()` – remove and return the first element
  - `peek()` – view the first element without removing
- Utility methods:
  - `isEmpty()` – check if the queue is empty
  - `size()` – get current number of elements
  

---

# Usage

You can create and use the queue like this:

```java
MyQueue<Integer> queue = new MyQueue<>();
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

System.out.println(queue.dequeue()); // 10
System.out.println(queue.peek());    // 20
System.out.println(queue.size());    // 2
```

---



## MyStack

It's a custom stack implementation built on top of the `MyArrayList<T>` dynamic array.

---

# Features

- Generic type support (`T extends Comparable<T>`)
- Follows LIFO principle (Last-In-First-Out)
- Core stack operations:
  - `push(item)` – add an element to the top of the stack
  - `pop()` – remove and return the top element
  - `peek()` – view the top element without removing
- Utility methods:
  - `isEmpty()` – check if the stack is empty
  - `size()` – get current number of elements
  

---

# Usage

You can create and use the stack like this:

```java
MyStack<Integer> stack = new MyStack<>();
stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.pop());  // 30
System.out.println(stack.peek()); // 20
System.out.println(stack.size()); // 2
```

---



## MyMinHeap

It's a custom **Min Heap** implementation built on top of the `MyArrayList<T>` dynamic array.

---

# Features

- Generic type support (`T extends Comparable<T>`)
- Implements min-heap structure (parent nodes are always smaller than their children)
- Core heap operations:
  - `insert(item)` – add an element and maintain heap order
  - `extractMin()` – remove and return the smallest element
  - `peek()` – return the smallest element without removing
- Utility methods:
  - `isEmpty()` – check if the heap is empty
  - `size()` – get current number of elements
  

---

# Usage

You can create and use the min heap like this:

```java
MyMinHeap<Integer> heap = new MyMinHeap<>();
heap.insert(30);
heap.insert(10);
heap.insert(20);

System.out.println(heap.peek());       // 10
System.out.println(heap.extractMin()); // 10
System.out.println(heap.peek());       // 20
System.out.println(heap.size());       // 2
```

---

Efficient for priority-based operations like scheduling, pathfinding (Dijkstra’s), and more.  
Backed by your own `MyArrayList`, ensuring dynamic resizing and element access.

---