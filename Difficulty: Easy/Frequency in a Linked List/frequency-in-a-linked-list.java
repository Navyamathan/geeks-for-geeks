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
}*/
// complete the below function


class Solution 
{
    public static int count(Node head, int key) 
    {
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        int count = 0;
        
        while(current.next != null)
        {
            if(current.next.data == key)
            {
                count++;
            }
            current = current.next;
        }
        return count;
    }
}