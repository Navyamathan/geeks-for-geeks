// User function Template for Java

class Solution {
    public int longestSubarray(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
       int length = 0;
       int sum = 0;
       for(int i=0; i<nums.length; i++)
       {
        sum += nums[i];
        if(sum == k)
        {
            length = Math.max(length,i+1);
        }
        else
        {
            if(map.containsKey(sum-k))
            {
                length = Math.max(length,i-map.get(sum-k)+1);
            }
        }
        if(!map.containsKey(sum))
        {
             map.put(sum,i+1);
        }
       }  
       return length;
    }
}
