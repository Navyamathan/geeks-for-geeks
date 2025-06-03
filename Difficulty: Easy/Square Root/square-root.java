/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution 
{
    int floorSqrt(int n) 
    {
        int l = 1;
        int h = n;
        int ans = 1;
        while(l <= h)
        {
            int m = (l+h)/2;
            long sq = m*m;
            if(sq <= n)
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