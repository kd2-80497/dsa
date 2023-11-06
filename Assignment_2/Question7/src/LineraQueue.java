import java.util.Scanner;

public class LineraQueue {

	private int rear;
	private int front;
	private int arr[];
	private final int size;

	public LineraQueue( int size) {

		this.rear = 0;
		this.front = 0;
		this.arr = new int[size];
		this.size = size;
	}

	public boolean isFull() {

		if (rear == size && front == 0)
			return true;
		return false;

	}
	

	public boolean isEmpty() {
  
		if (rear+1==front)
			return true;
		return false;

	}
	
	public void push(int data) {
		
		
		arr[rear]=data;
		rear++;
		
	}

	public void pop() {
	
		front++;
		
		
	}
	
	public  void peek() {
		System.out.println("element = "+arr[front]);
	}
	

}
