class Solution 
{
    public int firstElement(int[] nums, int target)
    {
        int r1 = -1;
        int l = 0;
        int h = nums.length-1;
        while(l <= h)
        {
            int m = (l+h)/2;
            if(nums[m] == target)
            {
                r1 = m;
                h = m-1;
            }
            else if(nums[m] < target)
            {
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return r1;
    }

    public int secondElement(int[] nums, int target)
    {
        int r2 = -1;
        int l = 0;
        int h = nums.length-1;
        while(l <= h)
        {
            int m = (l+h)/2;
            if(nums[m] == target)
            {
                r2 = m;
                l = m+1;
            }
            else if(nums[m] < target)
            {
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return r2;
    } 
    
    int countFreq(int[] arr, int target) 
    {
       int r1 = firstElement(arr, target);
       if(r1 == -1) return 0;
       
       int r2 = secondElement(arr, target);
       return r2-r1+1;
    }
}
