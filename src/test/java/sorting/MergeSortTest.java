package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTest {


    static Stream<Arguments> intArray() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{5, 1, 3, 2, 4}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{5, 1, 3, 2,}, new int[]{1, 2, 3, 5})
        );
    }

    @DisplayName("정수배열을 입력하면 정렬된다")
    @MethodSource("intArray")
    @ParameterizedTest
    void mergesort를수행하면_오름차순정렬된다(int[] input, int[] expected) {
        assertThat(MergeSort.mergeSort(input)).isSorted();
    }


}
