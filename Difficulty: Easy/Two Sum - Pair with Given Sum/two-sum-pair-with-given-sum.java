// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) 
    {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j)
        {
            int sum = arr[i] + arr[j];
            if(sum == target)
            {
                return true;
            }
            else if(sum > target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}