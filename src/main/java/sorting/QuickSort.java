package sorting;

public class QuickSort {

    public static int[] quickSort(int[] arbitraryElements) {
        quickSort(arbitraryElements, 0, arbitraryElements.length - 1);
        return arbitraryElements;
    }

    private static void quickSort(int[] arbitraryElements, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(arbitraryElements, left, right);

        // pivot을 기준으로 나눠서 재정렬
        quickSort(arbitraryElements, left, pivot - 1);
        quickSort(arbitraryElements, pivot + 1, right);
    }

    private static int partition(int[] arbitraryElements, int left, int right) {
        int pivot = left;
        for (int i = pivot + 1; i <= right; i++) {
            if (arbitraryElements[pivot] > arbitraryElements[i]) {
                swap(arbitraryElements, pivot, i);
                pivot = i;
            }
        }
        return pivot;
    }

    private static void swap(int[] arbitraryElements, int pivot, int i) {
        int temp = arbitraryElements[pivot];
        arbitraryElements[pivot] = arbitraryElements[i];
        arbitraryElements[i] = temp;
    }


}
