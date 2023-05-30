package Task2;

public class Shape {
    private double width;
    private double height;
    String a = "shape";

    public Shape(){
        height = width = 0.0;
    }

    public Shape(double wx) {
        height = width = wx;
    }

    public Shape(double width, double height){
        this.height = height;
        this.width = width;
    }

    void show_shape() { 
        System.out.println("Ширина = " + width);
        System.out.println("Высота = " + height);
    }

    void setWidth(double width){
        this.width = width;
    }

    void setHeight(double height){
        this.height = height;
    }

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }
}
