
public class Queue {
	
	
	private List list;
	
	public Queue() {
	list=new List();
		
		
		
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(int value) {
		
		list.addLast(value);

	}

	public void pop() {
		
		list.deleteFirst();
	}

	public void peek() {
		list.displayFirst();
	}


}
