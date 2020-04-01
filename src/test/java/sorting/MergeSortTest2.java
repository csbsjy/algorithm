package sorting;

import org.junit.Test;

public class MergeSortTest2 {

    @Test
    public void mergesort를수행하면_오름차순정렬된다() {
        int[] arr = {5, 4, 3, 2, 1};

        int[] result = MergeSort.mergeSort(arr);

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }

}
