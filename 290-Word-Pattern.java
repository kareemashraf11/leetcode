class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] c = pattern.toCharArray();
        String[] words = s.split(" ");
        if(words.length != c.length) return false;
        HashMap<Character, LinkedList<Integer>> hm = new HashMap<>();
        for(int i = 0; i < c.length; i++){
            if(!hm.containsKey(c[i]))
                hm.put(c[i], new LinkedList<>());
            hm.get(c[i]).add(i);
        }

        HashSet<String> hs = new HashSet<>();
        for(LinkedList<Integer> vals : hm.values()) {
            String first = words[vals.peek()];
            if(!hs.add(first)) return false;
            for(int idx : vals) {
                if(!words[idx].equals(first)) return false;
            }
        }
        return true;
    }
}