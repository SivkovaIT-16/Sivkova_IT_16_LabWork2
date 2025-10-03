public class HumanName {
    //Поля
    private Name name;
    private int height;

    //Свойства
    public Name getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setHeight(int height) {
        Validator.validateHeight(height);
        this.height = height;
    }

    //Конструкторы
    //По умолчанию
    public HumanName() {
        this.name = new Name();
        this.height = 180;
    }

    //С параметрами
    public HumanName(Name name, int height){
        this.name = name;
        this.height = height;
    }

    //Копирования
    public HumanName(HumanName humanName){
        this.name = humanName.name;
        this.height = humanName.height;
    }

    @Override
    public String toString(){
        return "Человек с именем " + name + " и ростом " + height;
    }
}
