public class Contact {
    String firstName;
    String LocalNAme;
    String city;
    String state;
    String email;
    int phone;
    int zip;

    public Contact(String firstName, int zip, int phone, String email, String state, String city, String localNAme) {
        this.firstName = firstName;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.state = state;
        this.city = city;
        LocalNAme = localNAme;
    }

}
