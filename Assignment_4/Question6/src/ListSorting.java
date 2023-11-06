
public class ListSorting {

	public static void main(String[] args) {
		
		List l1=new List();
		l1.addLast(40);
		l1.addLast(50);
		l1.addLast(20);
		l1.addLast(10);
		l1.addLast(30);
		l1.addLast(60);
		
		System.out.println("Original list");
		l1.displayList();
		l1.listSorting();
		
		System.out.println("Sorted list:");
		l1.displayList();
	}
		
		

	}


