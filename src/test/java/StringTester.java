import org.junit.Assert;
import org.junit.Test;

public class StringTester {
    @Test
    public void testReverseCase() {
        StringProject stats = new StringProject("This land is your land.");
        String expected = "tHIS LAND IS YOUR LAND.";
        Assert.assertEquals(expected, stats.reverseCase());
    }

    @Test
    public void testCharacterCount() {
        StringProject stats = new StringProject("This land is your land.");
        int expected = 2;
        Assert.assertEquals(expected, stats.characterCount('a'));
    }

    @Test
    public void testReverseString() {
        StringProject stats = new StringProject("This land is your land.");
        String expected = ".dnal ruoy si dnal sihT";
        Assert.assertEquals(expected, stats.reverseString());
    }

    @Test
    public void testEachWordOnALine() {
        StringProject stats = new StringProject("This land is your land.");
        String expected = "This\nland\nis\nyour\nland.";
        Assert.assertEquals(expected, stats.eachWordOnALine());
    }

    @Test
    public void testWordCount() {
        StringProject stats = new StringProject("This land is your land.");
        int expected = 5;
        Assert.assertEquals(expected, stats.wordCount());
    }

    @Test
    public void testCharacterCountWithoutSpaces() {
        StringProject stats = new StringProject("This land is your land.");
        int expected = 19;
        Assert.assertEquals(expected, stats.characterCount());
    }

    @Test
    public void testAvgWordLength() {
        StringProject stats = new StringProject("This land is your land.");
        double expected = 3.8;
        Assert.assertEquals(expected, stats.avgWordLength(), 0.001);
    }

    @Test
    public void testVowelCount() {
        StringProject stats = new StringProject("This land is your land.");
        long expected = 6;
        Assert.assertEquals(expected, stats.vowelCount());
    }

    @Test
    public void testSubstrCount() {
        StringProject stats = new StringProject("This land is your land.");
        int expected = 2;
        Assert.assertEquals(expected, stats.substrCount("s"));
    }

    @Test
    public void testIsPalindrome() {
        StringProject stats = new StringProject("Yo! Banana boy!");
        Assert.assertTrue(stats.isPalindrome());

        stats = new StringProject("This land is your land.");
        Assert.assertFalse(stats.isPalindrome());
    }
}
