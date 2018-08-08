package Lab18;

public class Lab18LinkedLists {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
//		test(list);

	
	
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.addAtEnd("E");
	//	list.addAtBeginning("Z");
	//	list.addAtEnd("Y");
	
		
	//	list.removeFromBeginning();
	//	list.removeFromEnd();
		
		
		System.out.println(list);
		System.out.println(list.size());
		list.removeAt(2);
		System.out.println(list);
		System.out.println(list.size());
		list.insertAt("K", 1);
		System.out.println(list);
		System.out.println(list.size());
	}
}
