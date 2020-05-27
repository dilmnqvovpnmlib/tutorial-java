import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Empty e = new Empty();
        // String s = e.toString();
        System.out.println(e);

        ArrayList<Integer> data = new ArrayList<>();
        data.add(8);
        data.add(9);
        for (int item : data) {
            System.out.println(item);
        }
    }
}