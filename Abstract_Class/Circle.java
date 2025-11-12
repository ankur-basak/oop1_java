public class Circle extends Shape{

    Circle(double r){
        super(r, r);
    }

    void area(){
        double result = 3.14 * dim1 * dim1;
        System.out.println("Area of Circle: " + result);
    }
    
}
