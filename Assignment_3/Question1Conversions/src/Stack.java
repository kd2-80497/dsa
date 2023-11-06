
public class Stack {

	private char arr[];
	private int top;
	private int size;

	public Stack(int size) {

		this.top = -1;
		this.size = size;
		this.arr = new char[size];
	}

	public void push(char data) {
		top++;
		arr[top] = data;
	}

	public char pop() {
		char data = arr[top];
		top--;

		return data;
	}

	public char peek() {
		char data = arr[top];

		return data;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top==size-1;
	}
	
}
