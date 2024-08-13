import java.util.List;

public class User {
    private String _name;
    private String _membership;
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
