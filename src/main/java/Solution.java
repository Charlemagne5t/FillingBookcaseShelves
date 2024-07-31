import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        Map<String, Integer> memo = new HashMap<>();
        return dfs(books, 0, 0, shelfWidth, 0, 0, memo);
    }

    int dfs(int[][] books, int i, int h, int shelfWidth, int max, int curW, Map<String, Integer> memo) {
        if (i == books.length) {
            return h + max;
        }
        if(memo.containsKey(i + " " + h + "" + max + " " + curW )){
            return memo.get(i + " " + h + "" + max + " " + curW);
        }
        int take = Integer.MAX_VALUE;
        int start;

        if (curW + books[i][0] <= shelfWidth) {
            take = dfs(books, i + 1, h, shelfWidth, Math.max(max, books[i][1]), curW + books[i][0], memo);
        }


        start = dfs(books, i + 1, h + max, shelfWidth, books[i][1], books[i][0], memo);


        int res = Math.min(take, start);
        memo.put(i + " " + h + "" + max + " " + curW , res);
        return res;
    }
}
