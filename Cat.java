public class Cat {
//     private String name;
//     private double age;
//     // конструктор по умолчанию
//     public Cat(){
//         age = 0.0;
//     }
//     // кастомный конструктор
    

//     public Cat(double age){
//         this.age = age;
//     }

//     void show_info() {
//         //clearScreen();//Очищаем консоль 
//         System.out.println("Имя = " + name);
//         System.out.println("Возраст  = " + age);
//     }

//     void setAge(double age){
//         this.age = age;
//     }

//     void setName(String name){
//         this.name = name;
//     }

//     double getAge(){
//         return age;
//     }

//     String getName(){
//         return name;
//     }
// }
    private double age;
    private String name;
    

    /**
     * Создали конструктор по умолчанию
     */
    public Cat(){
        age = 0.0;
    }

      /**
     * Создали кастомный конструктор
     */
    public Cat(double agx) {
        age = agx;
    }

    public Cat(double age, String name){
        this.age = age;
        this.name = name;
    }

    void greet() {
        //clearScreen();//Очищаем консоль 
        System.out.println("Мяу мяу");
        System.out.println("Меня зовут " + name);
        System.out.println("Мой возраст " + age);
    }
    void greetHuman() {
        System.out.println("Мой возраст " + age);
    }

    void setAge(double age){
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    double getAge(){
        return age;
    }

    String getName(){
        return name;
    }


    // Метод очистки консоли терминала
    // // public static void clearScreen() {
    //     System.out.print("\033[H\033[2J");
    //     System.out.flush();
    // }
}
