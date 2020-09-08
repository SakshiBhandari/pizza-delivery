
public class SideOrders {

    private String sideName;
    private int sideQuantity;
    private String dipName;

    private String sideNames[] = {"Garlic bread", "Calzone", "Cheese bread"};
    private int sidePrice[] = {100, 150, 200};

    String dipNames[] = {"Cheesy dip", "Garlic dip", "Ranch"};
    int dipPrice[] = {50, 50, 40};


    public void setSideName(String sideName) {
        this.sideName = sideName;
    }

    public void setDipName(String dipName) {
        this.dipName = dipName;
    }

    public int getSidePrice(String sideName) {


            for (int i = 0; i < sideNames.length; i++) {

                if (sideNames[i].equals(sideName)) {

                    return sidePrice[i];
                  } else {
                    System.out.println("Invalid choice.");
                    System.exit(1);
                }

            }


    public int getDipPrice(String dipName) {

          for (int i = 0; i < dipNames.length; i++) {
                if (dipNames[i].equals(dipName)) {

                    return dipPrice[i];
                }
                else {
                    System.out.println("Invalid choice.");
                    System.exit(1);
                }
            }
           }


    public void printSideNameAndPrice(String sideName) {
        for (int i = 0; i < sideNames.length; i++) {
            System.out.println("\t" + sideNames[i] + " : " + sidePrice[i]);
        }
    }


    public void printDipNameAndPrice(String dipName) {
        for (int i = 0; i < dipNames.length; i++) {
            System.out.println("\t" + dipNames[i] + " : " + dipPrice[i]);
        }
    }

}

        public int getSideQuantity () {
                return sideQuantity;
            }


