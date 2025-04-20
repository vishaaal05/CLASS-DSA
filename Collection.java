import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {

    static void ArrayListExample(){
        List<Integer> li = new ArrayList<>();

        li.add(1);
        li.add(2);
        li.add(1);

        System.out.println(li.contains(5));
        System.out.println(li.indexOf(1));
        System.out.println(li.get(1));
        System.out.println(li);

    }

    static void LinkedListExample(){
        List<Integer> li = new LinkedList<>();

        li.add(1);
        li.add(2);
        li.add(1);

        System.out.println(li.contains(5));
        System.out.println(li.indexOf(1));
        System.out.println(li.get(1));
        System.out.println(li);

    }
    public static void main(String[] args) {
        // ArrayListExample();
        LinkedListExample();
    }
}
