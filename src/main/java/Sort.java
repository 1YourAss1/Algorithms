import java.util.List;

import static java.util.Collections.swap;

public class Sort {

    // Bubble sort
    public static int[] bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }

    public static <T extends Comparable<? super T>> T[] bubble(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }

    public static <T extends Comparable<? super T>> List<T> bubble(List<T> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.size() - 1 - i; j++) {
                if (array.get(j).compareTo(array.get(j + 1)) > 0) {
                    swap(array, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }

    // Selection sort
    public static int[] selection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }

        return array;
    }

    public static <T extends Comparable<? super T>> T[] selection(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minPos]) < 0) {
                    minPos = j;
                }
            }
            T temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static <T extends Comparable<? super T>> List<T> selection(List<T> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j).compareTo(array.get(minPos)) < 0) {
                    minPos = j;
                }
            }
            swap(array, i, minPos);
        }
        return array;
    }

}
