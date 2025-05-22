// User function Template for Java

class Solution 
{
    public ArrayList<Integer> findSubarray(int arr[]) 
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int tempStart = -1;
        int start = -1;
        int end = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < 0)
            {
                sum = 0;
                continue;
            }
            if(sum == 0)
            {
                tempStart = i;
            }
            sum += arr[i];
            if(sum >= max)
            {
                max = sum;
                start = tempStart;
                end = i;
            }
        }
        
         ArrayList<Integer> list = new ArrayList<>();
        if(start == -1)
        {
            list.add(-1);
            return list;
        }
      
        for(int i=start; i<=end; i++)
        {
            list.add(arr[i]);
        }
        
        return list;
    }
}