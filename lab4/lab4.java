import java.util.Iterator;
import java.util.Iterator;
import java.util.List;


public class ListADT<E> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] data;
    private int size;

    public ListADT() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(E item) {
        if (size == data.length) {
        data[size++] = item;

    public void addAll(ListADT<E> items) {
        for (int i = 0; i < items.size(); i++) {
            add(items.get(i));
        }
    }

    public E get(int index) {
        return (E) data[index];
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    public void set(int index, E item) {
        data[index] = item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = data[i];
        }
        return array;
    }



    public void clear() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }
}
        
        
        
        
        
