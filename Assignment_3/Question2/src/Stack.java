
public class Stack {

	int top;
	int arr[];
	final int size;
	int max;

	public Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
		max = 0;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public void push(int data) {

		if (data > max) {
			max = data;
		}
		top++;
		arr[top] = data;
	}

	public int pop() {

		int data = arr[top];
		top--;
		max = arr[0];
		for (int i = 0; i <= top; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return data;

	}

	public int peek() {
		return arr[top];

	}

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public int maxValue() {
		return max;

	}
}
