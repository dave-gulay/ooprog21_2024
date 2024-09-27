public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();
        
        a.setRadius(3);
        System.out.println("Circle A - Radius: " + a.getRadius());
        System.out.println("Circle A - Diameter: " + a.getDiameter());
        System.out.println("Circle A - Area: " + a.getArea());

        b.setRadius(20);
        System.out.println("Circle B - Radius: " + b.getRadius());
        System.out.println("Circle B - Diameter: " + b.getDiameter());
        System.out.println("Circle B - Area: " + b.getArea());
    }
}