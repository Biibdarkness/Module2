package bai5.praAccessModifier;

public class TestStudent {
    public static void main(String[] args) {
    Student stu = new Student();
        System.out.println(stu.getName());
        System.out.println(stu.getClasses());
        stu.setClasses("C1021K1");
        stu.setName("Mia");
        System.out.println(stu.getName());
        System.out.println(stu.getClasses());

    }
}
