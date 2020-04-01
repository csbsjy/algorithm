package sorting;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (isSingleElement(arr)) {
            return arr;
        }
        // 1. divide
        int middle = arr.length / 2;
        int[] frontElements = mergeSort(divide(arr, 0, middle - 1));
        int[] backElements = mergeSort(divide(arr, middle, arr.length - 1));

        // 2. conquer
        return conquer(frontElements, backElements);
    }

    private static int[] conquer(int[] frontElements, int[] backElements) {
        int[] sortedElements = new int[frontElements.length + backElements.length];

        int left = 0;
        int right = 0;
        int base = 0;
        while (left < frontElements.length && right < backElements.length) {
            if (frontElements[left] < backElements[right]) {
                sortedElements[base++] = frontElements[left++];
            } else {
                sortedElements[base++] = backElements[right++];
            }
        }

        if (left < right) {
            while ((left <= right) && base < sortedElements.length) {
                sortedElements[base++] = frontElements[left++];
            }
        } else {
            while ((left >= right) && base < sortedElements.length) {
                sortedElements[base++] = backElements[right++];
            }
        }

        return sortedElements;
    }

    private static int[] divide(int[] arr, int startIdx, int endIdx) {
        int[] copyHalfArr = new int[endIdx - startIdx + 1];
        for (int i = 0, originIdx = startIdx; i < copyHalfArr.length; i++) {
            copyHalfArr[i] = arr[originIdx++];
        }
        return copyHalfArr;
    }

    private static boolean isSingleElement(int[] arr) {
        return arr.length <= 1;
    }
}
