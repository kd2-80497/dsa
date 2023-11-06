import java.util.Scanner;



public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeList employee = new EmployeeList();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("--------Employee Management System ------");
			System.out.println("1.Add Employee");
			System.out.println("2.Display Employee");
			System.out.println("3.Search Employee by name");
			System.out.println("4.Delete Employee by empid");
			System.out.println("5.Update salary of employee");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:System.out.println("Enter employee details...");
			System.out.println("Enter EMP ID = ");
			int id = sc.nextInt();
			System.out.println("Enter Name = ");
			String name = sc.next();
			System.out.println("Enter salary = ");
			double sal = sc.nextDouble();
			employee.addEmployee(id, name, sal);
			
			
				break;
				
			case 2:employee.display();
				break;
				
			case 3:System.out.println("ENTER NAME TO SEARCH..");
			String n =sc.next();
			
			EmployeeList.Employee emp= employee.searchByName(n);
				if(emp!=null) {
					System.out.println("found....");
					System.out.println("ID = "+ emp.empid);
					System.out.println("Name = "+ emp.name);
					System.out.println("salary = "+emp.salary);
					
				}
				else
					System.out.println("NOT FOUND....");
				
			break;
			
			case 4 :System.out.println("enter emp id to delete ");
			int empid = sc.nextInt();
			
			int pos = employee.searchbyId(empid);
			if(pos!=0)
			employee.deleteAtpos(pos);
			else
				System.out.println("dleted...");
				
			
			
			
				break;
				
			case 5:System.out.println("enter emp id to delete ");
			int eid = sc.nextInt();
			System.out.println("enter new salary  ");
			double sala = sc.nextDouble();
			
			int pos1 = employee.searchbyId(eid);
			if(pos1!=0)
			employee.updateAtpos(pos1, sala);
			
				
			
				break;
				
				
				

			}

		} while (choice != 0);
	}
}