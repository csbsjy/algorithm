package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {

    static Stream<Arguments> intArray() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{5, 4, 3, 2, 1}),
                Arguments.of(new int[]{5, 1, 3, 2, 4}),
                Arguments.of(new int[]{5, 1, 3, 2,})
        );
    }

    @DisplayName("정수배열을 입력하면 정렬된다")
    @MethodSource("intArray")
    @ParameterizedTest
    void quicksort를수행하면_오름차순정렬된다(int[] input) {
        assertThat(QuickSort.quickSort(input)).isSorted();
    }


}
