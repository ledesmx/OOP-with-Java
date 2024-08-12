import java.util.ArrayList;

public class Static {
    public static void main(String[] args) {
        // Static Mebers of the class
        // Anything static on a class is accessed on that class directly
        // instead of accessinf it on an object
        // It also guarantees that ther's only one attribute/method of the class

        // admins is a public static attribute of the User class
        // so we can access it directly
        User.admins = new ArrayList<User>();

        User.admins.add(new User("Ronaldo"));
        User.admins.add(new User("Messi"));
        User.admins.add(new User("Haaland"));
        User.admins.add(new User("Mbappe"));

        // print_admins_name is also static
        User.print_admins_name();
    }
}
