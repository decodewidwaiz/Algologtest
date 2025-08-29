class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int res = 0;
        int wstart = 0;

        for (int wend = 0; wend < s.length(); wend++) {
            if (hashMap.containsKey(s.charAt(wend)) && wstart < hashMap.get(s.charAt(wend))){
                wstart = hashMap.get(s.charAt(wend));
            }
            hashMap.put(s.charAt(wend), wend+1);
            res = Math.max(res, wend-wstart+1);

        }
        return res;
    }
}