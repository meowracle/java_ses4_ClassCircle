public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(6.0, "black");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(6.0, "red", 12);
        System.out.println(cylinder);
    }
}
