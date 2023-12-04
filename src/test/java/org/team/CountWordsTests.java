package org.team;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CountWordsTests {

    @Test
    void twoWordsEndingInS() {
        int wordsCounter = CountWords.count("cats have furs yeah");
        assertThat(wordsCounter).isEqualTo(2);
    }

    @Test
    void twoWordsEndingInR() {
        int wordsCounter = CountWords.count("purr on fur burr yeah");
        assertThat(wordsCounter).isEqualTo(3);
    }

    @Test
    void noWords() {
        int wordsCounter = CountWords.count("i got nothing");
        assertThat(wordsCounter).isZero();
    }

    @Test
    void startsWithS() {
        int wordsCounter = CountWords.count("s is fine");
        assertThat(wordsCounter).isEqualTo(2);
    }

    @Test
    void endsWithS() {
        int wordsCounter = CountWords.count("s has fines");
        assertThat(wordsCounter).isEqualTo(3);
    }

    @Test
    void mixedWords() {
        int wordsCounter = CountWords.count("cats have fur and ears");
        assertThat(wordsCounter).isEqualTo(3);
    }

    @Test
    void startsAndEndsWithS() {
        int wordsCounter = CountWords.count("sandals");
        assertThat(wordsCounter).isEqualTo(1);
    }

    @Test
    void nullString() {
        int wordsCounter = CountWords.count(null);
        assertThat(wordsCounter).isZero();
    }

    @Test
    void oneS() {
        int wordsCounter = CountWords.count("s");
        assertThat(wordsCounter).isEqualTo(1);
    }

    @Test
    void oneSpace() {
        int wordsCounter = CountWords.count(" ");
        assertThat(wordsCounter).isZero();
    }

    @Test
    void emptyString() {
        int wordsCounter = CountWords.count("");
        assertThat(wordsCounter).isZero();
    }

    @Test
    void nonSpaceSeparator() {
        int wordsCounter = CountWords.count("cats*have   fur$and?ears..");
        assertThat(wordsCounter).isEqualTo(3);
    }
}
