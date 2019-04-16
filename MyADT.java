import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyADT<T> implements Collection<T> {
    private T[] data;
    private int size;
    public MyADT() {
        data = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public boolean add(T addedObject) {
        if (size == data.length) {
            return false;
        }
        data[size++] = addedObject;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean didRemove = false;
        for (int i = 0; i < data.length && !didRemove; i++) {
            if (data[i].equals(o)) {
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[data.length - 1] = null;
                didRemove = true;
                size--;
            }
        }
        return didRemove;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }

    private class MyIterator<T> implements Iterator<T> {
        int myCount = 0;
        @Override
        public boolean hasNext() {
            return myCount != size;
        }

        @Override
        public T next() {
            return (T) data[myCount++];
        }
    }

    // IGNORE
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public T[] toArray(Object[] a) {
        return data;
    }

    public static void main(String[] args) {
        MyADT<String> yAyDT = new MyADT<>();
        yAyDT.add("Devansh");
        yAyDT.add("Shreyas");
        yAyDT.add("CS 1331");

        System.out.println(" ---- Explicit ---- ");

        // Use EXPLICIT Iterator
        Iterator<String> ITER = yAyDT.iterator();
        System.out.println(ITER.hasNext());

        while (ITER.hasNext()) {
            System.out.println(ITER.next());
        }

        System.out.println(" ---- Implicit ---- ");
        // Use IMPLICIT Iterator
        for (String item: yAyDT) {
            System.out.println(item);
        }
    }
}
