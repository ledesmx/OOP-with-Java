public class Student2 extends User2 {
    private boolean _verified;

    public Student2(String name) {
        set_name(name);
        set_membership("student");
        _verified = false;
    }

    public Student2(String name, boolean verified) {
        set_name(name);
        set_membership("student");
        _verified = verified;
    }

    // Here we override this method from the User class
    public void gen_id(String id) {
        System.out.println("Student ID generated: " + id);
        set_id(id);
    }

    public void set_verified(boolean verified) {
        _verified = verified;
    }

    public boolean get_verified() {
        return _verified;
    }
}
