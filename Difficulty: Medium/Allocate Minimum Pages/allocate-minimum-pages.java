
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k)
    {
        if(arr.length < k)
        {
            return -1;
        }
        
        int l = arr[0];
        int h = 0;
        for(int temp : arr)
        {
            l = Math.max(l,temp);
            h += temp;
        }
        while(l <= h)
        {
            int m = (l+h)/2;
            if(calculation(arr, k, m))
            {
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return l;
    }
    
    public static boolean calculation(int[] arr, int k, int m)
    {
        int count = 1;
        int pageCount =0;
        for(int i=0; i<arr.length; i++)
        {
            if(pageCount + arr[i] <= m)
            {
                pageCount += arr[i];
            }
            else
            {
                count++;
                pageCount = arr[i];
            }
        }
        if(count > k)
        {
            return true;
        }
        return false;
    }
}