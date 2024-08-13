// We use the extends keyword to inherit from other class
public class Student extends User {
    private boolean _verified;

    // If there is no default void contructor in the super class
    // then we need to call the constructor of the super class with super()
    public Student(String name) {
        super(name, "student");
        _verified = false;
    }

    public Student(String name, boolean verified) {
        super(name, "student");
        _verified = verified;
    }

    public void set_verified(boolean verified) {
        _verified = verified;
    }

    public boolean get_verified() {
        return _verified;
    }
}
