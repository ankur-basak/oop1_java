public class Test {

    public static void main(String[] args) {
        
        Shape shape;

        shape = new Rectangle(15, 30);
        shape.area();

        shape = new Triangle(10,20);
        shape.area();

        shape = new Circle(8);
        shape.area();
    }
    
}
