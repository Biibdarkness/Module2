package bai5.accessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        System.out.println(cir.getRadius());
        System.out.println(cir.getColor());
        Circle cir1 = new Circle(2);
        System.out.println(cir1.getRadius());

    }
}
