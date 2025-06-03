// User function Template for Java

class Solution 
{
    public int nthRoot(int n, int m) 
    {
        int l = 1;
        int h = m;
        while(l <= h)
        {
            int mid = (l+h)/2;
            int result = calculation(mid, n, m);
            if(result == 0)
            {
                return mid;
            }
            else if(result == 1)
            {
                h = mid -1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return -1;
    }
    
    public int calculation(int mid, int n, int m)
    {
        long ans = 1;
        for(int i=1; i<=n; i++)
        {
            ans = ans* mid;
            if(ans > m) return 1;
        }
        if(ans == m) return 0;
        return 2;
    }
}