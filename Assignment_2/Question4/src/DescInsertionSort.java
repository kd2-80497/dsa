import java.util.Arrays;

public class DescInsertionSort {

	public static void descInsertionSort(int arr[], int size) {

		for (int i = 1; i < size; i++)

		{
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {
				 arr[j + 1]=arr[j];
				j--;

			}

			arr[j + 1] = temp;
		}

	}
	
	
	public static void main(String[] args) {
		int arr[] = { 44, 11, 55, 22, 66, 33 };
		System.out.println("BEFORE SORTING " + Arrays.toString(arr));
		descInsertionSort(arr, arr.length);
		System.out.println("AFTER SORTING " + Arrays.toString(arr));

	}
	}


