
public class List {
	private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public List() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (isEmpty())
        {
            head = newNode;
        } 
        else 
        {
            Node trav = head;
            while (trav.next != null) 
            {
                trav = trav.next;
            }
            trav.next = newNode;
        }
    }
    public void display()
    {
    	Node trav=head;
    	System.out.print("List :");
    	while(trav!=null)
    	{
    		System.out.print(trav.data+" ");
    		trav=trav.next;
    	}
    	System.out.println();
    }


    public void reverseList() {
    	 if (isEmpty() || head.next == null)
         {
             return; 
         }
    	Node t1=head;
    	Node t2=head.next;
    	head.next=null;
    	
    	
    	while(t2!=null) {
    		
    		Node temp = t2.next;
    		t2.next=t1;
    		t1=t2;
    		t2=temp;
    		
    		
    		
    	}
    	
    	head=t1;
    }
}
