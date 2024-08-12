import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {

        // Generic lists
        // It allow us to work with numerous objects
        ArrayList<User> users = new ArrayList<User>();

        users.add(new User("Leonardo"));
        users.add(new User("Kendrick"));
        users.add(new User("Miguel"));
        users.add(new User("Juan"));
        users.add(new User("Esteban"));
        users.add(new User("Azul"));
        users.add(new User("Caleb"));

        for (int i = 0; i < users.size(); i++) {
            System.out.println("User " + i + " : " + users.get(i).get_name());
        }
    }
}
