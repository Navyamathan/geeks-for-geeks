// User function Template for Java

class Solution 
{
    public int findKRotation(List<Integer> nums) 
    {
        int l = 0;
        int h = nums.size()-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(l <= h)
        {
            int m = (l+h)/2;
            if(nums.get(l) <= nums.get(h))
            {
                if(ans > nums.get(l))
                {
                    ans = nums.get(l);
                    index = l;
                }
                break;
            }
            if(nums.get(l) <= nums.get(m))
            {
                if(ans > nums.get(l))
                {
                    ans = nums.get(l);
                    index = l;
                }
                l = m+1;
            }
            else
            {
                if(ans > nums.get(m))
                {
                    ans = nums.get(m);
                    index = m;
                }
                h = m-1;
            }
        }
        return index;
        
    }
}