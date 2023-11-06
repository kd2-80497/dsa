
public class DescendingStack {

	private int top;
	private int min;
	private int arr[];
	private int size;

	public DescendingStack(int size) {
		arr = new int[size];
		top = size;
		min = 50;
		this.size = size;
	}

	public boolean isfull() {
		return top == 0;
	}

	public boolean isEmpty() {
		return top == size - 1;
	}

	public void push(int data) {

		if (data < min) {
			top--;
			arr[top] = data;
			min=data;
		} else {
			System.out.println("cannot push..");
		}

	}

	public void pop() {
		top++;
	}

	public void peek() {
		System.out.println(" element is = " + arr[top]);
	}
}
