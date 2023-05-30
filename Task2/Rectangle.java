package Task2;

public class Rectangle extends Shape {

    public Rectangle() {
        super();
        
    }

    public Rectangle(double width, double height) {
        super(width, height);

    }
    public Rectangle(double wx) {
        super(wx);
        
    }

    void calculateArea(){
        System.out.println("Площадь прямоугольника равна = " + getHeight() * getWidth());
    }

    void calculatePerimeter(){
        System.out.println("Периметр прямоугольника равен = " + (2*(getHeight() + getWidth())));
    }
}
