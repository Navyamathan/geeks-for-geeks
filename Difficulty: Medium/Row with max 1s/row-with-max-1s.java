// User function Template for Java

class Solution 
{
    public int rowWithMax1s(int mat[][]) 
    {
       int maxCount = -1;
        int index = -1;
        for(int i=0; i<mat.length; i++)
        {
            int count = countOfOnes(mat[i]);
            if(count > maxCount)
            {
                maxCount = count;
                index = i;
            }
        }
        return index;
    }
    
     public int countOfOnes(int[] arr)
    {
        int n = arr.length;
        int l = 0;
        int h = n-1;
        int ans = n;
        while(l <= h)
        {
            int m = (l+h) / 2;
            if(arr[m] < 1)
            {
                l = m+1;
            }
            else
            {
                ans = m;
                h = m-1;
            }
        }
        return n - ans;
    }
}