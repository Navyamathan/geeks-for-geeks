class Solution 
{
    static ArrayList<Integer> leaders(int arr[]) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[arr.length-1];
        list.add(arr[arr.length-1]);
        for(int i = arr.length-2; i>=0; i--)
        {
            if(arr[i] >= max)
            {
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
