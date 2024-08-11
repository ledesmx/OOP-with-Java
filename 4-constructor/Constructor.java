public class Constructor {
    public static void main(String[] args) {
        // We use the constructor for passing parameters when we instace the object
        // When no constructor is provided then the default contructor is called
        // We can use it to require certain parameters

        User usr = new User("Logan", "Yellow");
        User usr2 = new User("Deadpool");

        System.out.println(usr.get_name() + " " + usr.get_membership());
        System.out.println(usr2.get_name() + " " + usr2.get_membership());
    }
}
