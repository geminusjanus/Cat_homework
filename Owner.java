public class Owner extends Cat {
    String name;

    /**
     * Создали конструктор по умолчанию
     */
    public Owner() {
        super();
        name = "none";
    }

    /**
     * Создали кастомный конструктор
     */
    public Owner(double age, String name) {
        super(age);// Обратились к родительскому конструктору
        this.name = name;// Обратились к родительским полям родительского конструктора
    }


    public Owner(double agx) {
        super(agx);
        name = "none";
    }

    

    void show_name() {
        System.out.println("Меня зовут " + name);
    }
    
}
