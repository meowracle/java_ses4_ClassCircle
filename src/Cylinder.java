public class Cylinder extends Circle {
    public double height;
    public Cylinder() {};
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.radius * height;
    }

    public String toString() {
        return "Hinh tru co chieu cao = " +getHeight() + " va the tich = " + getVolume() + " la mot lop ke thua tu " + super.toString();
    }
}
