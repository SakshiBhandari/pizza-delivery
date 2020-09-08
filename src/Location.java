import java.util.HashMap;

public class Location {

    public String getPizzaOutletLocation(String customerLocation) {

        //Hashmap that contains the list of locations.


        HashMap<String, String> location = new HashMap<>();
        location.put("Mayur Vihar", "Mayur Vihar phase-1");
        location.put("Jitar Nagar", "Preet Vihar");
        location.put("Union City", "Alvarado Niles Blvd");
        location.put("Manchester", "Northern Quaters");

        if (location.containsKey(customerLocation)) {
            return location.get(customerLocation);
        } else {
            System.out.println("Invalid location");
            System.exit(1);
            return "Invalid location";
        }

    }
}