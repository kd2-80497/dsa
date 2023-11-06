
public class Stack {
	

	List list ;

	public Stack() {
		list= new List();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(int value) {
		
		list.addFirst(value);

	}

	public void pop() {
		
		list.deleteFirst();
	}

	public void peek() {
		list.displayFirst();
	}

}
