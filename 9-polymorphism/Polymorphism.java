import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism
        // We can treat numerous derived classes as ther parent class
        // but the subclasses can do things specific to those subclasses

        Student student = new Student("Karl", true);
        Teacher teacher = new Teacher("Mario", "5436784643");

        // Here we create an array list of Users
        // Since both Student and Teacher types extend from User
        // is totally fine to add them to the array list of type User
        ArrayList<User> users = new ArrayList<User>();
        users.add(student);
        users.add(teacher);
        users.add(new User("Max"));
        users.add(new User("Stuard"));

        int id = 0;
        for (User usr : users) {
            // Here the gen_id method is specific to each type but we use them as if they
            // were the same
            usr.gen_id(String.valueOf(id));

            id++;
        }
    }
}
