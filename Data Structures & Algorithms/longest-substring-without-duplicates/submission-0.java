class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sl=new HashSet<>();
        int left=0;
        int right=0;
        int length=0;
        while(right<s.length())
        {
            while(sl.contains(s.charAt(right)))
            {
                sl.remove(s.charAt(left));
                left++;
            }
            
            sl.add(s.charAt(right));

            length=Math.max(length,right-left+1);

            right++;
        }
        return length;
    }
}
