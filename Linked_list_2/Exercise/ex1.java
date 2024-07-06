import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class Tester {
    
    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
        // Create a new list to store the concatenated elements
        List<Object> concatenatedList = new LinkedList<Object>();

        // Add elements from the first list to the concatenated list
        concatenatedList.addAll(listOne);

        // Iterate over the second list in reverse order using descendingIterator
        Iterator<Object> reverseIterator = listTwo.descendingIterator();
        while (reverseIterator.hasNext()) {
            concatenatedList.add(reverseIterator.next());
        }

        return concatenatedList;
    }


	public static void main(String args[]) {
		List<Object> listOne = new LinkedList<Object>();
		listOne.add("Hello");
		listOne.add(102);
		listOne.add(25);
		listOne.add(38.5);
		
		List<Object> listTwo = new LinkedList<Object>();
		listTwo.add(150);
		listTwo.add(200);
		listTwo.add('A');
		listTwo.add("Welcome");
		
		List<Object> concatenatedList = concatenateLists(listOne, listTwo);
		
		System.out.println("Concatenated linked list:");
		for (Object value : concatenatedList) {
			System.out.print(value+" ");
		}
	}
}