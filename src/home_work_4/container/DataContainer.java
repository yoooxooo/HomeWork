package home_work_4.container;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length-1] = item;
        return data.length - 1;
    }

    public T get(int index) {
        if (0 <= index && index < data.length) {
            return data[index];
        }
        return null;
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        if (1 <= index + 1 && index + 1 < data.length) {
            for (int i = index; i + 1 < data.length; i++) {
                T buffer = data[i + 1];
                data[i + 1] = data[i];
                data[i] = buffer;
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        } else if (0 <= index && index < data.length) {
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        return false;
    }

    public boolean delete(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (item == data[i]) {
                for (int j = i; j + 1 < data.length; j++) {
                    T buffer = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = buffer;
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j + 1 < data.length; j++) {
                if (comparator.compare(data[j], data[j+1]) > 0) {
                    T buffer = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = buffer;
                }
            }
        }
    }

    public static void sort(DataContainer<? extends Comparable> container){
        DataContainer.sort(container, new ComparatorComparable());
    }

    public static <T> void sort(DataContainer<T> container, Comparator<? super T> cmp){
        boolean sorted;
        do {
            sorted = true;
            for (int j = 0; j < container.data.length-1; j++){
                if(cmp.compare(container.data[j], container.data[j + 1]) > 0){
                    sorted = false;
                    T tmp = container.data[j + 1];
                    container.data[j + 1] = container.data[j];
                    container.data[j] = tmp;
                }
            }
        } while (!sorted);
    }

    public String toString () {
        String result = "[";
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                result += data[i];
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] != null) {
                        result += ", ";
                        break;
                    }
                }
            }
        }
            result += "]";
        return result;
    }
}
