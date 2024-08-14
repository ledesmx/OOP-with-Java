import java.util.List;

public class User {
    private String _name;
    private String _membership;
    private String _id;
    public static List<User> admins;

    public static void print_admins_name() {
        for (User admin : admins) {
            System.out.println(admin.get_name());
        }
    }

    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    public User(String name) {
        set_name(name);
        set_membership("Silver");
    }

    public String toString() {
        return _name + " " + _membership;
    }

    public boolean equals(User u2) {
        if (_name != u2.get_name() || _membership != u2.get_membership()) {
            return false;
        }
        return true;
    }

    // Here we defined the gen_id() method which will be used for the
    // subclasses
    public void set_id(String id) {
        _id = id;
    }

    // This class will be overrided by the subclasses
    public void gen_id(String id) {
        System.out.println("New ID generated: " + id);
        set_id(id);
    }

    void set_name(String name) {
        _name = name;
    }

    void set_membership(String membership) {
        _membership = membership;
    }

    void set_membership(Membership membership) {
        _membership = membership.name();
    }

    String get_name() {
        return _name;
    }

    String get_membership() {
        return _membership;
    }
}
