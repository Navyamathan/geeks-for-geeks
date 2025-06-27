/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution 
{
    Node deleteNode(Node head, int x) 
    {
        if(head == null) return null;
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        int count = 0;
        
        while(current.next != null)
        {
            count++;
            if(count == x)
            {
                current.next = current.next.next;
                return dummy.next;
            }
            else
            {
                current = current.next;
            }
        }
        return dummy.next;
    }
}