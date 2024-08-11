public class User {
    private String _name;
    private String _membership;

    // The contructor has to match the class name and there's no return type
    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    // We can overload the contructor as well
    public User(String name) {
        set_name(name);
        set_membership("Silver");
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
