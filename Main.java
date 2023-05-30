public class Main {
    public static void main(String[] args){
        Cat c1 = new Cat(5.5, "Полигон");
        Owner h1 = new Owner(24, "Никита");


        c1.greet();
        h1.show_name();
        h1.greetHuman();
    }
}
