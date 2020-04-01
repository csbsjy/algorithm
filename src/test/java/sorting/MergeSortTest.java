package sorting;

import junit.framework.TestCase;
import org.junit.Test;

public class MergeSortTest extends TestCase {

    @Test
    public void mergesort를수행하면_오름차순정렬된다() {
        int[] arr = {5, 4, 3, 2, 1};

        MergeSort.mergeSort(arr);
    }

}
