public class Pizza {

    private String pizzaType;
    private int pizzaPrice;
    private String pizzaName;

    private String vegPizzaNames[] = {"Peppy Paneer", "Farmhouse", "Tandoori Paneer"};
    private int vegPizzaPrice[] = {100, 200, 300};

    private String nonVegPizzaNames[] = {"Tandoori chicken", "Chicken Fiesta", "Chicken Barbeque"};
    private int nonVegPizzaPrice[] = {200, 300, 400};


    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    //INPUT - Type of Pizza, Pizza Name
    //RETURNS - Price of a Pizza
    public int getPizzaPrice(String pizzaType, String pizzaName) {

        int price = 0;

        if (pizzaType.equals("Veg")) {
            price = getVegpizzaPrice(pizzaName);

        } else if (pizzaType.equals("Non-veg")) {
            price = getNonVegPizzaPrice(pizzaName);
        } else {
            System.out.println("Invalid Pizza Type");
            System.exit(1);
        }
        return price;
    }

    //this method fetches the price of veg pizzas.
    private int getVegpizzaPrice(String pizzaName) {


        for (int i = 0; i < vegPizzaNames.length; i++) {

            if (vegPizzaNames[i].equals(pizzaName)) {

                return vegPizzaPrice[i];
            }

        }
        return 0;
    }

    //this method fetches the price of Non-veg pizzas.
    private int getNonVegPizzaPrice(String pizzaName) {
        for (int i = 0; i < nonVegPizzaNames.length; i++) {

            if (nonVegPizzaNames[i].equals(pizzaName)) {

                return nonVegPizzaPrice[i];
            }
        }
        return 0;
    }

    //INPUT - pizza type.
    //PRINTS - prices and names of the pizzas.
    public void printPizzaNameAndPrice(String pizzaType) {
        if (pizzaType.equals("Veg")) {
            printVegPizzaNameAndPrice();
        } else if (pizzaType.equals("Non-veg")) {
            printNonVegPizzaNameAndPrice();
        } else {
            System.out.println(pizzaType);
            System.out.println("Invalid Pizza Type");
            System.exit(1);
        }
    }

    //PRINTS - veg pizza names with their prices.
    private void printVegPizzaNameAndPrice() {
        for (int i = 0; i < vegPizzaNames.length; i++) {
            System.out.println("\t" + vegPizzaNames[i] + " ========= " + vegPizzaPrice[i]);
        }

    }

    //PRINTS - non-veg pizza names with their prices.
    private void printNonVegPizzaNameAndPrice() {
        for (int i = 0; i < nonVegPizzaNames.length; i++) {
            System.out.println("\t" + nonVegPizzaNames[i] + " ========= " + nonVegPizzaPrice[i]);
        }
    }
}
