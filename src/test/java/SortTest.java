import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {

    @Test
    public void bubbleSortTest() {
        // before
        int[] array = {1, 7, 19, -2, 58, 43, 5};
        List<Integer> integerList = Arrays.asList(1, 7, 19, -2, 58, 43, 5);
        List<Double> doubleList = Arrays.asList(1.0, 7.0, 19.0d, -2.0, 58.44, 43.3, 5d);

        // when
        int[] sortedArray = Sort.bubble(array);
        List<Integer> sortedIntegerList = Sort.bubble(integerList);
        List<Double> sortedDoubleList = Sort.bubble(doubleList);

        // then
        assertArrayEquals(new int[]{-2, 1, 5, 7, 19, 43, 58}, sortedArray);
        assertArrayEquals(Arrays.asList(-2, 1, 5, 7, 19, 43, 58).toArray(), sortedIntegerList.toArray());
        assertArrayEquals(Arrays.asList(-2.0, 1.0, 5.0, 7.0, 19.0, 43.3, 58.44).toArray(), sortedDoubleList.toArray());
    }
}