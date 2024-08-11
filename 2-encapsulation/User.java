public class User {
    // We can use private to prevent access to the attributes
    private String _name;
    private String _membership;

    // And we use Getters and Setters to gate access to out attributes
    void set_name(String name) {
        System.out.println("Setting name");
        _name = name;
    }

    void set_membership(String membership) {
        _membership = membership;
    }

    String get_name() {
        System.out.println("Getting name");
        return _name;
    }

    String get_membership() {
        return _membership;
    }
}
