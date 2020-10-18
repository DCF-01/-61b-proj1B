import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    // Your tests go here.
    @Test
    public void testEqualChars() {

        assertFalse(offByOne.equalChars('b', 'z'));
        assertFalse(offByOne.equalChars('g', 'u'));

        assertTrue(offByOne.equalChars('a', 'b'));
        assertTrue(offByOne.equalChars('b', 'a'));
        assertTrue(offByOne.equalChars('q', 'r'));
        assertTrue(offByOne.equalChars('&', '%')); // chars have 1 off integers

    }
}