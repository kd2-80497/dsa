import java.util.Arrays;

public class Main {

	public static void sortBySalary(Employee[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j].getSalary() > arr[j + 1].getSalary()) {
					Employee temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}

	}

	public static void main(String[] args) {

		Employee emp[] = {
						new Employee(1, "anshu", 120000),
						new Employee(2, "ojaswi", 150000),
						new Employee(3, "sonam", 110000),
						new Employee(4, "prerna", 130000),
						new Employee(5, "janvi", 140000)};
		
		System.out.println("before sorting "+ Arrays.toString(emp));
		sortBySalary(emp);
		System.out.println("after sorting "+ Arrays.toString(emp));

	}

}
