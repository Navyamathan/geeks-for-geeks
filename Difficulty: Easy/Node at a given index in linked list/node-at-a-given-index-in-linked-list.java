/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) 
    {
        Node temp = head;
        int val = -1;
        int i = 1;
        while(temp != null)
        {
            if(i == index)
            {
                return temp.data;
            }
            temp = temp.next;
            i++;
        }
        return val;
        
    }
}