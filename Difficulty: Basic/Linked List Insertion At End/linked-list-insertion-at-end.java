/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution 
{
    public Node insertAtEnd(Node head, int x) 
    {
        if(head == null)
        {
            Node newNode1 = new Node(x);
            return newNode1;
        }
        
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
            continue;
        }
        Node newNode = new Node(x);
        temp.next = newNode;
        return head;
    }
}