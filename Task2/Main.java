package Task2;

public class Main {
    public static void main(String[] args){
        Rectangle t5 = new Rectangle(8.0, 2.0 );
        Rectangle t6 = new Rectangle(25.0, 12.0 );

        t5.show_shape();
        t5.calculateArea();
        t5.calculatePerimeter();

        t6.show_shape();
        t6.calculateArea();
        t6.calculatePerimeter();
    }
}
