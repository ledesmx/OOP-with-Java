public class Overriding {
    public static void main(String[] args) {

        // Method overriding is where a subclass provides a specific implementation
        // for a method that is already defined in its superclass

        // As usr extends the Object class, we can override methods from the Object
        // class
        User usr = new User("Hank", "Black");
        System.out.println(usr);

        User usr2 = new User("Hank", "Black");
        if (usr.equals(usr2)) {
            System.out.println(usr.toString() + " And " + usr2.toString() + " are equals");
        } else {
            System.out.println(usr.toString() + " And " + usr2.toString() + " are not equals");
        }

        usr2.set_membership("Blue");
        if (usr.equals(usr2)) {
            System.out.println(usr.toString() + " And " + usr2.toString() + " are equals");
        } else {
            System.out.println(usr.toString() + " And " + usr2.toString() + " are not equals");
        }
    }
}
