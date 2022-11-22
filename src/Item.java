public class Item {

    public static final String askName = "What is the name of the item you are looking for?";
    public static final String askAmount = "How many of this item would you like?";
    public static final String askPrice = "What is the price of this item?";


    public Item(String name, int sku, int amount, double price) {
        this.name = name;
        this.sku = sku;
        this.amount = amount;
        this.price = price;
    }

    String name;
    int sku; // generate a 7 digit number and assign it
    int amount;
    double price;

    public static Item createItem() {
        String name = ScannerHelper.getString(askName);
        // NAME CHECK??? AND THE REST AS WELL
        int amount = ScannerHelper.getInt(askAmount);
        double price = ScannerHelper.getDouble(askPrice) * amount;


        return new Item(
                name,
                (int) ((Math.random() * 9_000_000) + 1_000_000), // 1_000_000  to 9_999_999 ()
                amount,
                price
        );
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", sku=" + sku +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(createItem());
    }

}
