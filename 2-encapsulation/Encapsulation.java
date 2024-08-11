public class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation is that you can hide inner details
        // It allows you to abstract away the insides of the class
        // So the person who's using the class don't have to know
        // all the inner details defined in the class
        // which makes developing a whole lot easier

        // We define our attributes with the private keyword to hide them
        User usr = new User();

        // Now we cannot access directly to the attributes
        // usr._name = "Joel";

        // Getters and Setters are methods attached to objects
        // that allow us to gate access to our attributes
        usr.set_name("Joel");
        usr.set_membership("Silver");

        System.out.println(usr.get_name());
        System.out.println(usr.get_membership());
    }
}
