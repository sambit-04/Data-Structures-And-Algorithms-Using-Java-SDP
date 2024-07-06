import java.util.LinkedList;
import java.util.List;

class Tester {
    
    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> commonElements = new LinkedList<>();

        for (Integer value : listOne) {
            if (listTwo.contains(value)) {
                commonElements.add(value);
            }
        }

        return commonElements;
    }
    
    public static void main(String args[]) {
        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(12);
        listOne.add(21);
        listOne.add(1);
        listOne.add(53);
        
        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(11);
        listTwo.add(21);
        listTwo.add(25);
        listTwo.add(53);
        listTwo.add(47);

        List<Integer> commonElements = findCommonElements(listOne, listTwo);

        System.out.println("Common elements between the lists:");
        for (Integer value : commonElements) {
            System.out.print(value + " ");
        }
    }
}
