public class Address {


    public Address(String street1, String state, String country, int zip) {
        this.street1 = street1;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }


    public Address(String street1, String street2, String state, String country, int zip) {
        this(street1, state, country, zip);
        this.street2 = street2;
    }


    public static final String askStreet1 = "What is your street1?";
    public static final String askStreet2 = "What is your street2? (OPTIONAL)";
    public static final String askState = "What is the current state?";
    public static final String askCountry = "What is the name of your country?";
    public static final String askZip = "What is your zipcode?";

    String street1;
    String street2;
    String state;
    String country;
    int zip;

    public static Address createAddress() {
        String street1 = ScannerHelper.getString(askStreet1);
        String street2 = ScannerHelper.getString(askStreet2);
        String state = ScannerHelper.getString(askState);
        String country = ScannerHelper.getString(askCountry);
        int zip = ScannerHelper.getInt(askZip);

        if (street2.isEmpty()) return new Address(street1, state, country, zip);

        return new Address(street1, street2, state, country, zip);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                (street2 == null ? "" : ", street2='" + street2 + '\'') +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zip=" + zip +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(createAddress());
    }
}
