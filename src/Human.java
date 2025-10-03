public class Human {
    //Поля
    private String name;
    private int height;

    //Свойства
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        Validator.validateName(name);
        this.name = name;
    }

    public void setHeight(int height) {
        Validator.validateHeight(height);
        this.height = height;
    }

    //Конструкторы
    //По умолчанию
    public Human(){
        this.name = "Иван";
        this.height = 180;
    }

    //С параметрами
    public Human(String name, int height){
        Validator.validateClassHuman(name, height);
        this.name = name;
        this.height = height;
    }

    //Копирования
    public Human(Human human){
        this.name = human.name;
        this.height = human.height;
    }

    @Override
    public String toString(){

        return name + ", рост: " + height;
    }
}
