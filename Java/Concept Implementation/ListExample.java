import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Anurag");
        names.add("Gururaj");
        names.add("Tushar");
        names.add("Suresh");
        names.add("Surya");

        System.out.println(names);

        // Print only names that start with 'S'
        for (String name : names) {
            if (name.startsWith("S")) {
                System.out.println(name);
            }
        }
    }
}
