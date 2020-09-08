import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws Exception {


        // Use a buffered reader to take input of the customer's location
        // 1. Create a buffered rea der object
        // 2. Store the customer's location in a variable


        int totalBill = 0;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your location:");
        String customerLocation = reader.readLine();


        Location location = new Location();
        System.out.println("The nearest pizza outlet is:" + location.getPizzaOutletLocation(customerLocation));


        System.out.println("Enter your choice: Veg or Non-veg.");
        String pizzaType = reader.readLine();

        Pizza pizza = new Pizza();
        System.out.println("Choose your pizza:");
        pizza.printPizzaNameAndPrice(pizzaType);
        String pizzaName = reader.readLine();
        System.out.println();

        System.out.println("Do you want to add any side with your order: Yes or No?");
        String answer = reader.readLine();

        SideOrders side = new SideOrders();
        System.out.println("Choose your side order:");
        //side.printSideNameAndPrices(sideName);
        String sideName = reader.readLine();

        System.out.println();
        System.out.println("Choose your choice of dip:");
        //side.printDipNameAndPrice(dipName);


        totalBill = pizza.getPizzaPrice(pizzaType, pizzaName) + side.getSidePrice(sideName) + side.getDipPrice(dipName);
        System.out.println("Your total bill is:");
        System.out.println(totalBill);

    }
}

