
public class ListMain {

	public static void main(String[] args) {
		List list = new List();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
	list.beforeNode(5, 200);
	list.afterNode(3, 500);
		list.displayList();

	}

}
