import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void bubbleSortTest() {
        // before
        int[] array = {1, 7, 19, 2, 58, 43, 5};

        // when
        int[] sortedArray = Sort.bubble(array);

        // then
        assertArrayEquals(new int[]{1, 2, 5, 7, 19, 43, 58}, sortedArray);
    }
}