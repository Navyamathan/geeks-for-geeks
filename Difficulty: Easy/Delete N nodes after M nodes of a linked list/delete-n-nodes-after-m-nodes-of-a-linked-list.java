/*
delete n nodes after m nodes
The input list will have at least one element
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution 
{
    static void linkdelete(Node head, int n, int m) 
    {
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        int count = -1;
        
        while(current.next != null)
        {
            count++;
            if(count == m)
            {
                for(int i=0; i<n; i++)
                {
                    if(current.next != null)
                    {
                        current.next = current.next.next;
                    }
                }
                count = -1;
                continue;
            }
            else
            {
                current = current.next;
            }
        }
    }
}