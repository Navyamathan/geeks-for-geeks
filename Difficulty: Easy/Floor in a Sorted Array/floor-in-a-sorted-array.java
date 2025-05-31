class Solution 
{
    static int findFloor(int[] arr, int x) 
    {
        int l = 0;
        int h = arr.length-1;
        int ans = -1;
        
        while(l <= h)
        {
            int m = (l+h)/2;
            if(arr[m] <= x)
            {
                ans = m;
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return ans;
    }
}
