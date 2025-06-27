/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) 
    {
        if(head == null) return null;
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        
        while(current.next.next != null)
        {
            if(current.next.data == current.next.next.data)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
        return dummy.next;
    }
}