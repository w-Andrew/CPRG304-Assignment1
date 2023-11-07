import java.util.Iterator;
import java.util.Iterator;
import java.util.List;

public class DLL<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DLL() {
        head = null;
        tail = null;
    }

    public void addFirst(E item) {
        Node<E> new = new Node<>(item);
        if (isEmpty()) {
            head = new;
            tail = new;
        } else {
            new.next = head;
            head.prev = new;
            head = new;
        }
        size++;
    }

    public void addLast(E item) {
        Node<E> new = new Node<>(item);
        if (isEmpty()) {
            head = new;
            tail = new;
        } else {
            new.prev = tail;
            tail.next = new;
            tail = new;
        }
        size++;
    }

    public E removeFirst()
        E item = head.data;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return item;
    }

    public E removeLast() {
        E item = tail.data;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev
            tail.next = null;
        }
        size--;
        return item;
    }

    public void addAll(ListADT<? extends E> items) {
        for (int i = 0; i < items.size(); i++) {
            addLast(items.get(i));
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }
}
