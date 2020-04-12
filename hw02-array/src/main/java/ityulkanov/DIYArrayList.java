package ityulkanov;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DIYArrayList<T> implements List<T> {

    private Object[] storage;
    private int position;


    public DIYArrayList() {
        this.storage = new Object[10];
        this.position = 0;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean add(T t) {
        if (position < storage.length) {
            System.out.println("adding element");
            storage[position] = t;
            position++;
            return true;
        } else if (position < Integer.MAX_VALUE >> 1) {
            System.out.println("expanding storage size");
            int newStorageSize = storage.length << 1;
            this.storage = Arrays.copyOf(storage, newStorageSize);
            storage[position] = t;
            position++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();

    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();

    }
}

