public class Teacher2 extends User2 {
    private String _phone;

    public Teacher2(String name) {
        set_name(name);
        set_membership("teacher");
    }

    public Teacher2(String name, String phone) {
        set_name(name);
        set_membership("teacher");
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
