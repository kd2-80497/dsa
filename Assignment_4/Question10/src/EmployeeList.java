
public class EmployeeList {

	public class Employee {
		 int empid;
		 String name;

	 double salary;
		private Employee next;

		public Employee(int id, String name, double salary) {
			this.empid = id;
			this.name = name;
			this.salary = salary;
			this.next = null;
		}

		public void display() {
			System.out.println("id = " + empid);
			System.out.println("NAME = " + name);
			System.out.println("SALARY = " + salary);
		}
	}

	private Employee head;
	private Employee tail;
	int pos=0;

	public EmployeeList() {

		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addEmployee(int id, String name, double sal) {
		Employee e = new Employee(id, name, sal);
		if (isEmpty()) {
			head = e;
			tail = e;
		} else {
			e.next = head;
			head = e;

		}

	}

	public void display() {
		Employee trav = head;

		while (trav != null) {
			trav.display();
			System.out.println("***********************************************");
			trav = trav.next;
		}

	}

	public Employee searchByName(String n) {
		Employee trav = head;
		while (trav != null) {
			if (trav.name.equals(n)) {
				return trav;
			}
			trav = trav.next;
		}
		return null;

	}
	public int searchbyId(int n) {
	
		int count=0;
		
		
		if(isEmpty()) {
			System.out.println("LIST IS EMPYTY....");
		}
		else if(head.empid==n) 
			head=null;
		
		else {
			Employee trav = head;
			while(trav!=null) {
				count++;
				if(trav.empid==n) {
				pos=count;
				break;
					
				}
				trav=trav.next;
				
			}
			
			
			
		}
		
		
		
		return pos;
		
	}
	
	public void deleteAtpos(int pos) {
		
		Employee trav = head;
		while(trav.next.next != null) {
		for(int i=1; i<pos-1 ;i++) {
			
			trav=trav.next;
		}
		trav.next=trav.next.next;
		System.out.println("DELETED SUCCESSFULL....");
		return;
		}
		
		
		
		
		
	}
public void updateAtpos(int pos,double salary) {
	
	
		Employee trav = head;
		while(trav.next != null) {
		for(int i=1; i<pos ;i++) {
			
			trav=trav.next;
		}
		trav.salary=salary;
		System.out.println("UPDATED SUCCESSFULL....");
		return;
		}
		
		
		
	}

}
