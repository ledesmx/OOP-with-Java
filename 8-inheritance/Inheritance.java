public class Inheritance {
    public static void main(String[] args) {
        // Inheritance
        // This is when a class (subclass) inherits the code from other class (super
        // class)

        // Here Student is a subclass of User
        // Any time we intance a Student is going to inherit everything from User
        // And Student can have extra stuff in
        Student stu = new Student("Michael");

        // Then we can use the methods from the Student class such as set_verified()
        // and get_verified()
        // And use the methods from the User class such ass get_name()
        stu.set_verified(true);
        System.out.println(stu.get_name() + " " + stu.get_verified());

        // NOTE
        // - We can only inherit from one class but implement numerous interfaces
        // - We can override method from the super class as well
    }
}
