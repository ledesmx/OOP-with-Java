public class Overloading {
    public static void main(String[] args) {
        // Method overloading allows us to create diffetent variations
        // of method with different types

        User usr = new User();

        usr.set_name("Clark");
        // Here we use the method with Enum variation
        usr.set_membership(Membership.Platinum);
        System.out.println(usr.get_name() + " " + usr.get_membership());

        // Then we use the method with the String variation
        usr.set_membership("Black");
        System.out.println(usr.get_name() + " " + usr.get_membership());
    }
}
