import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int arr[], int size) {
int count=0;
		for (int i = 1; i < size; i++)

		{
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				count++;
				 arr[j + 1]=arr[j];
				j--;

			}

			arr[j + 1] = temp;
		}
		System.out.println("count = "+count);

	}

	public static void main(String[] args) {
		int arr[] = { 44, 11, 55, 22, 66, 33 };
		System.out.println("BEFORE SORTING " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("AFTER SORTING " + Arrays.toString(arr));

	}

}
