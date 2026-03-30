import java.util.LinkedList;

public class RemoveAllElements {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        // Removing all elements
        list.clear();

        System.out.println("List after removing all elements: " + list);
    }
}