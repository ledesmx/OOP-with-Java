public class Introduction {
    public static void main(String[] args) {
        // Create and Object which is an instance of a class
        User usr = new User();
        usr.name = "Alberto";
        usr.membership = "Gold";

        // You can have multiple instances of the same class
        // allowing code reusability
        User usr2 = new User();
        usr2.name = "Juan";
        usr2.membership = "Platinum";

        System.out.println(usr.name + " " + usr.membership);
        System.out.println(usr2.name + " " + usr2.membership);
    }
}
