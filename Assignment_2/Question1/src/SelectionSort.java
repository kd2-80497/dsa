import java.util.Arrays;

public class SelectionSort {
	
	
	public static void selectionSort(int arr[],int size) {
		int count=0;
		for(int i =0;i<size-1;i++) {
			
			for(int j=i+1;j<size;j++) {
				count++;
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("count = "+count);
	}

	public static void main(String[] args) {
	
		int arr[] = {44,11,55,22,66,33};
		System.out.println("BEFORE SORTING "+Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("AFTER SORTING "+Arrays.toString(arr));
		
		

	}

}
