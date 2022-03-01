import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {
    private static int[] array;
    private static Integer[] integerArray;
    private static List<Integer> integerList;
    private static List<Double> doubleList;
    private static List<String> stringList;

    @BeforeClass
    public static void setup() {
        array = new int[] {1, 7, 19, -2, 58, 43, 5};
        integerArray = new Integer[] {1, 7, 19, -2, 58, 43, 5};
        integerList = Arrays.asList(1, 7, 19, -2, 58, 43, 5);
        doubleList = Arrays.asList(1.0, 7.0, 19.0d, -2.0, 58.44, 43.3, 5d);
        stringList = Arrays.asList("D", "A", "C", "B");
    }


    @Test
    public void bubbleSortTest() {
        // when
        int[] sortedArray = Sort.bubble(array);
        Integer[] sortedIntegerArray = Sort.bubble(integerArray);
        List<Integer> sortedIntegerList = Sort.bubble(integerList);
        List<Double> sortedDoubleList = Sort.bubble(doubleList);
        List<String> sortedStringList = Sort.bubble(stringList);

        // then
        assertArrayEquals(new int[]{-2, 1, 5, 7, 19, 43, 58}, sortedArray);
        assertArrayEquals(new Integer[]{-2, 1, 5, 7, 19, 43, 58}, sortedIntegerArray);
        assertArrayEquals(Arrays.asList(-2, 1, 5, 7, 19, 43, 58).toArray(), sortedIntegerList.toArray());
        assertArrayEquals(Arrays.asList(-2.0, 1.0, 5.0, 7.0, 19.0, 43.3, 58.44).toArray(), sortedDoubleList.toArray());
        assertArrayEquals(Arrays.asList("A", "B", "C", "D").toArray(), sortedStringList.toArray());
    }

    @Test
    public void selectionSortTest() {
        // when
        int[] sortedArray = Sort.selection(array);
        Integer[] sortedIntegerArray = Sort.selection(integerArray);
        List<Integer> sortedIntegerList = Sort.selection(integerList);
        List<Double> sortedDoubleList = Sort.selection(doubleList);
        List<String> sortedStringList = Sort.selection(stringList);

        // then
        assertArrayEquals(new int[]{-2, 1, 5, 7, 19, 43, 58}, sortedArray);
        assertArrayEquals(new Integer[]{-2, 1, 5, 7, 19, 43, 58}, sortedIntegerArray);
        assertArrayEquals(Arrays.asList(-2, 1, 5, 7, 19, 43, 58).toArray(), sortedIntegerList.toArray());
        assertArrayEquals(Arrays.asList(-2.0, 1.0, 5.0, 7.0, 19.0, 43.3, 58.44).toArray(), sortedDoubleList.toArray());
        assertArrayEquals(Arrays.asList("A", "B", "C", "D").toArray(), sortedStringList.toArray());
    }
}