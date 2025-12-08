import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");

        System.out.println(capitalCities);
    }
}
