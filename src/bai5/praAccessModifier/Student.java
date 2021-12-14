package bai5.praAccessModifier;

public class Student {
    private String name = "john";
    private String classes = "C02";
    Student(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
