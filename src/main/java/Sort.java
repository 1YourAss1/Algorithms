
import java.util.List;

import static java.util.Collections.swap;

public class Sort {

    public static int[] bubble (int[] array) {
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

    public static <T extends Comparable<T>> List<T> bubble(List<T> array) {
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
}
