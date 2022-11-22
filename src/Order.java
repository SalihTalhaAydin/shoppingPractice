import java.util.ArrayList;
import java.util.List;

public class Order {

    public static void main(String[] args) {

        System.out.println(Questions.welcomeMessage);

        List<Item> items = new ArrayList<>();
        while (true){

            String continueInput = ScannerHelper.getString(
                    items.size() == 0 ? Questions.askItem : Questions.askContinue
            );

            if (continueInput.toUpperCase().startsWith("N")) break;

            items.add(Item.createItem());
        }

        if (items.size() == 0) System.out.println("You exited the application!");
        else {
            Address customerAddress = Address.createAddress();

            double total = 0;
            for (Item item : items) {
                System.out.println(item);
                total += item.price;
            }
            System.out.println("Total price = " +  total);
            System.out.println(customerAddress);
        }


        /*
        print every item
        print the total
        print address
         */

    }
}
