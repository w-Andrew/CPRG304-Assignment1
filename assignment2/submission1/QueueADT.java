public class MyStack<T> implements StackADT<T> {
    private MyArrayList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            return null; 
        }
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
