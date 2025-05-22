// User function Template for Java

class Solution 
{
    void rearrange(ArrayList<Integer> arr)
    {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0; i<arr.size(); i++)
        {
            if(arr.get(i) < 0)
            {
                neg.add(arr.get(i));
            }
            else
            {
                pos.add(arr.get(i));
            }
        }
        
        if(neg.size() > pos.size())
        {
            for(int i=0; i<pos.size(); i++)
            {
                arr.set(i*2 , pos.get(i));
                arr.set(i*2+1 , neg.get(i));
            }
            int index = pos.size()*2;   // it start with the positive index(because pos and neg are evenly stored and again it start with pos index)
            for(int i=pos.size(); i<neg.size(); i++)
            {
                arr.set(index , neg.get(i));
                index++;
            }
        }
        else
        {
            for(int i=0; i<neg.size(); i++)
            {
                arr.set(i*2 , pos.get(i));
                arr.set(i*2+1 , neg.get(i));
            }
            int index = neg.size()*2;
            for(int i=neg.size(); i<pos.size(); i++)
            {
                arr.set(index , pos.get(i));
                index++;
            }
        }
    }
}