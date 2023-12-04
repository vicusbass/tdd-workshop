package org.team;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;import static org.assertj.core.api.Assertions.in;

class ParameterizedWordsTests {

    private static Stream<Arguments> stringsProviders() {
        return Stream.of(
                Arguments.of("cats have fur and ears", 3),
                Arguments.of("", 0),
                Arguments.of(null, 0),
                Arguments.of("cats*have   fur$and?ears..", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("stringsProviders")
    void testCountWords(String input, int expectedCount) {
        assertThat(CountWords.count(input)).isEqualTo(expectedCount);
    }

}
