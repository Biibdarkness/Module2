package bai10.arrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            System.out.println("Capacity phải lớn hơn 0");
        }
    }

    private int size() {
        return this.size;
    }

    private void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    private boolean add(E object) {
        if (elements.length == size) {
            this.ensureCapacity(2);
        }
        elements[size] = object;
        size++;
        return true;
    }

    private void ensureCapacity(int mincapacity) {
        if (mincapacity >= 0) {
            int newSize = this.elements.length + mincapacity;
            elements = Arrays.copyOf(elements, newSize);

        } else {
            System.out.println("Phần mở rộng phải lớn hơn 0");
        }
    }

    public void add( E element,int index) {
        if (index > elements.length) {
            System.out.println("không có vị trí: " + index);
        } else if (elements.length == size){
            System.out.println(element + " nằm ở vị trí " + index);
            this.ensureCapacity(2);
        }
        if (elements[index]==null){
            elements[index] = element;
            size++;
        } else {
            for (int i = size+1; i >= index; i--) {
                elements[i]= elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }


    public E remove(int index) {
        if (index >= size || index < 0) {
            System.out.println("Index must be smaller than size and greater than 0 ");
        }

        return (E) "abc";
    }

}
