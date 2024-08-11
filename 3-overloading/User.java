public class User {
    private String _name;
    private String _membership;

    void set_name(String name) {
        _name = name;
    }

    // We can create multiple variations of the same method
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
