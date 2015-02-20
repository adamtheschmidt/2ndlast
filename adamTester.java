public class adamTester{

	public static void main(String[] args){

		List testlist = new LinkedList();

		testlist.addFront(5);
		testlist.addFront(10);
		testlist.addFront(15);
		testlist.addFront(20);
		testlist.addFront(25);

		System.out.println(testlist);

		testlist.add2ndLast(3);

		System.out.println(testlist);

		testlist.clear();

		System.out.println(testlist);
	
		testlist.add2ndLast(3);
		testlist.add2ndLast(6);
		testlist.add2ndLast(9);
		testlist.add2ndLast(12);
		testlist.add2ndLast(15);

		System.out.println(testlist);

	}

} 
