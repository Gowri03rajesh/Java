import java.util.ArrayList;

class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
        System.out.println(item + " pushed to stack");
    }

    public T pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
    public void display() {
        System.out.println("Stack: " + list);
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>();

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        intStack.display();

        System.out.println("Popped: " + intStack.pop());
        intStack.display();

        Stack<String> strStack = new Stack<>();

        strStack.push("A");
        strStack.push("B");

        strStack.display();

        System.out.println("Popped: " + strStack.pop());
        strStack.display();
    }
}