package Lab18;

public class ListApp {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
//		test(list);
	
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.addAtEnd("E");
//		list.addAtBeginning("Z");
//		list.addAtEnd("Y");
	
		
//		list.removeFromBeginning();
//		list.removeFromEnd();
		
		
		System.out.println(list);
		System.out.println(list.size());
		list.removeAt(3);
		System.out.println(list);
		System.out.println(list.size());
		list.insertAt(1, "K");
		System.out.println(list);
		System.out.println(list.size());
	}

}
