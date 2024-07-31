import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[][] books = {
                {1,1},
                {2,3},
                {2,3},
                {1,1},
                {1,1},
                {1,1},
                {1,2},
        };
        int shelfWidth = 4;
        int expected = 6;
        int actual = new Solution().minHeightShelves(books, shelfWidth);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int[][] books = {
                {1,3},
                {2,4},
                {3,2},
        };
        int shelfWidth = 6;
        int expected = 4;
        int actual = new Solution().minHeightShelves(books, shelfWidth);

        Assert.assertEquals(expected, actual);
    }
}
