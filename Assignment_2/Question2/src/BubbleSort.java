import java.util.Arrays;

public class BubbleSort {
	
	
	public static void bubbleSort(int arr[],int size) {
		int count =0;
		for(int i =0;i<size;i++) {
			int flag=0;
			for(int j=0;j<size-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					count++;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag==0) {
				break;
			}
		}
		System.out.println("COUNT = "+count);
		
	}

	public static void main(String[] args) {
		
		int arr[] = {22, 11, 33, 44, 55, 66};
		System.out.println("BEFORE SORTING "+Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println("AFTER SORTING "+Arrays.toString(arr));
		
	}

}
