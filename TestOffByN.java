import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByN {
    //test if offby equals the space between characters
    // int 1 should be returned for char a char b .. etc
    //off by 3
    static CharacterComparator offbyN_3 = new OffByN(3);

    //off by 5
    static CharacterComparator offbyN_5 = new OffByN(5);


    @Test
    public void testoffbyN(){
        assertTrue(offbyN_3.equalChars('a', 'd'));
        assertTrue(offbyN_3.equalChars('b', 'e'));

        assertFalse(offbyN_3.equalChars('a', 'a'));
        assertFalse(offbyN_3.equalChars('c', 'd'));


        assertTrue(offbyN_5.equalChars('a', 'f'));
        assertTrue(offbyN_5.equalChars('b', 'g'));

        assertFalse(offbyN_5.equalChars('a', 'a'));
        assertFalse(offbyN_5.equalChars('b', 'h'));
    }
}
