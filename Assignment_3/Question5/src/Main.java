import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ReverseArray re = new ReverseArray(5);
		int[] arr= {10,20,30,40,50};
		System.out.println("Before reversing:"+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			re.push(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=re.pop();
		}
		System.out.println("After reversing:"+Arrays.toString(arr));

	}

	}


