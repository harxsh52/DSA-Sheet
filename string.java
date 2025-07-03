// Java program to demonstrate 
// keySet() with duplicate keys
import java.util.HashMap;

public class string {
    public static void main(String[] args) {

        // Creating an empty HashMap
        HashMap<String, Integer> m = new HashMap<>();

        // Adding key-value pairs
        m.put("Geeks", 10);
        m.put("for", 20);
        m.put("Geeks", 30);  
        m.put("Welcomes", 40);
        m.put("You", 50);

        // Displaying the HashMap
        System.out.println("Initial Mappings: " + m);

        // Using keySet() to get the set view of keys
        System.out.println("The keys are: " + m.values());
    }
}