import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void truncateString_returnsOriginal_whenLengthIsLessThanLimit() {
        String result = Main.truncateString("Hi", 5);

        assertEquals("Hi", result);
    }

    @Test
    void truncateString_returnsOriginal_whenLengthEqualsLimit() {
        String result = Main.truncateString("Hello", 5);

        assertEquals("Hello", result);
    }

    @Test
    void truncateString_truncates_whenLengthExceedsLimit() {
        String result = Main.truncateString("Hello world", 5);

        assertEquals("Hello", result);
    }

    @Test
    void truncateString_returnsEmptyString_whenLimitIsZero() {
        String result = Main.truncateString("Hello", 0);

        assertEquals("", result);
    }

    @Test
    void truncateString_handlesEmptyString() {
        String result = Main.truncateString("", 5);

        assertEquals("", result);
    }

    @Test
    void truncateString_truncatesSingleCharacter() {
        String result = Main.truncateString("Testing", 1);

        assertEquals("T", result);
    }
}