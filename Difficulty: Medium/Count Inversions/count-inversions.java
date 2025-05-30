// User function Template for Java

class Solution 
{
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) 
    {
        return mergeSort(arr , 0 , arr.length-1);
    }
    
    static int mergeSort(int[] arr, int l, int h)
    {
        if(l == h)
        {
            return 0;
        }
        int count = 0;
        int m = (l+h)/2;
        count += mergeSort(arr, l, m);
        count += mergeSort(arr, m+1, h);
        count += merge(arr, l, m, h);
        return count;
    }
    
    static int merge(int[] arr, int l, int m, int h)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m+1;
        int count = 0;
        
        while(left <= m && right <= h)
        {
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                count += m - left + 1;
                temp.add(arr[right]);
                right++;
            }
        }
        
        while(left <= m)
        {
            temp.add(arr[left]);
            left++;
        }
        
        while(right <= h)
        {
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=l; i<=h; i++)
        {
            arr[i] = temp.get(i-l);
        }
        
        return count;
    }
}