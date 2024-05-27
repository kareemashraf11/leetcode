class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        if(sArr.length != tArr.length) return false;
        HashMap<Character, LinkedList<Integer>> hm = new HashMap<>();
        for(int i = 0; i < sArr.length; i++){
            if(!hm.containsKey(sArr[i]))
                hm.put(sArr[i], new LinkedList<>());
            hm.get(sArr[i]).add(i);
        }

        HashSet<Character> hs = new HashSet<>();
        for(LinkedList<Integer> vals : hm.values()) {
            char first = tArr[vals.peek()];
            if(!hs.add(first)) return false;
            for(int idx : vals) {
                if(tArr[idx] != first) return false;
            }
        }
        return true;

        

    }
}