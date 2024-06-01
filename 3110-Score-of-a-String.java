class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        char[] c = s.toCharArray();
        for(int i = 1; i < c.length; i++)
            score+= (Math.abs(c[i] - c[i - 1]));
        return score;
    }
}