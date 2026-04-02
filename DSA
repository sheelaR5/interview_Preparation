DAY-1
1.Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement))
            return new int[]{map.get(complement),i};
            map.put(nums[i],i);
        }
    return null;
    }
}
2.longest Substring without repeating characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> se=new HashSet<>();
        int res=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(se.contains(c)){
                se.remove(s.charAt(l));
                l++;
            }
            se.add(c);
            res=Math.max(res,i-l+1);
        }
        return res;
        
    }
}
