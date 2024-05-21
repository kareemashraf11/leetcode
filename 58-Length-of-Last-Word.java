class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        char[] c = s.toCharArray();
        for(int i = c.length - 1; i >= 0; i--) {
            if(c[i] == ' ' && res > 0)
                break;
            if(c[i] != ' ')
                res++;
        }
        return res;
    }
}