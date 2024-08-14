public class Teacher extends User {
    private String _phone;

    public Teacher(String name) {
        super(name, "teacher");
    }

    public Teacher(String name, String phone) {
        super(name, "teacher");
        _phone = phone;
    }

    // Here we override this method from the User class
    public void gen_id(String id) {
        System.out.println("Teacher " + get_name() + " ID generated: " + id);
        set_id(id);
    }

    public void set_phone(String phone) {
        _phone = phone;
    }

    public String get_phone() {
        return _phone;
    }
}
