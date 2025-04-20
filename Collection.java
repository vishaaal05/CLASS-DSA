import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Collection {

    static void ArrayListExample() {
        List<Integer> li = new ArrayList<>();

        li.add(1);
        li.add(2);
        li.add(1);

        System.out.println(li.contains(5));
        System.out.println(li.indexOf(1));
        System.out.println(li.get(1));
        System.out.println(li);

    }

    static void LinkedListExample() {
        LinkedList<Integer> li = new LinkedList<>();

        li.add(1);
        li.add(2);

        li.add(1);
        li.addLast(5);
        li.addFirst(0);

        li.removeFirst();

        System.out.println(li.contains(5));
        System.out.println(li.indexOf(1));
        System.out.println(li.get(1));
        System.out.println(li);
        System.out.println(li.peekFirst());
        System.out.println(li.peekLast());

    }

    static void StackExample() {
        Stack<String> s = new Stack<>();

        s.push("Vishal");
        s.push("Arun");
        s.push("Rahbar");
        // s.pop();
        System.out.println(s);
        System.out.println(s.peek());
    }

    public static void main(String[] args) {
        // ArrayListExample();
        // LinkedListExample();
        StackExample();
    }
}
