import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();
    static OffByOne offbyone = new OffByOne();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindrome(){
        // standard palindrome test

        Assert.assertFalse(palindrome.isPalindrome("tree"));
        Assert.assertTrue(palindrome.isPalindrome("noon"));
        Assert.assertFalse(palindrome.isPalindrome("oak"));
        Assert.assertTrue(palindrome.isPalindrome("toot"));
        Assert.assertTrue(palindrome.isPalindrome("lol"));
    }

    @Test
    public void testIsPalindrome_2(){
        //test overload method

        // true if letters are off by one in word ex: (a,b) (b,a) (e,f) (f,e) --> TRUE

        Assert.assertTrue(palindrome.isPalindrome("acb", new OffByOne()));
        Assert.assertTrue(palindrome.isPalindrome("bca", new OffByOne()));
        Assert.assertTrue(palindrome.isPalindrome("bdcca", new OffByOne()));

        // false if ... (a,a) (b,b) (a,z) (z,a) --> FALSE
        Assert.assertFalse(palindrome.isPalindrome("bdccac", new OffByOne()));
        Assert.assertFalse(palindrome.isPalindrome("aaa", new OffByOne()));
        Assert.assertFalse(palindrome.isPalindrome("aqyjsa", new OffByOne()));
    }
}