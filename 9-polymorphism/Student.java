public class Student extends User {
    private boolean _verified;

    public Student(String name) {
        super(name, "student");
        _verified = false;
    }

    public Student(String name, boolean verified) {
        super(name, "student");
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
