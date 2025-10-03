public class Name {
    //Поля
    private String surname;
    private String personalName;
    private String patronymic;

    //Свойства
    public String getSurname() {
        return surname;
    }

    public String getPersonalName() {
        return personalName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPersonalName(String PersonalName) {
        this.personalName = personalName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    //Конструкторы
    //По умолчанию
    public Name(){
        this.surname = "Иванов";
        this.personalName = "Иван";
        this.patronymic = "Иванович";
    }

    //С параметрами
    public Name(String surname, String personalName, String patronymic){
        Validator.validateClassName(surname, personalName, patronymic);
        this.surname = surname;
        this.personalName = personalName;
        this.patronymic = patronymic;
    }

    public Name(String surname, String personalName) {
        Validator.validateClassName(surname, personalName, null);
        this.surname = surname;
        this.personalName = personalName;
        this.patronymic = null;
    }

    public Name(String personalName) {
        Validator.validateClassName(null, personalName, null);
        this.surname = null;
        this.personalName = personalName;
        this.patronymic = null;
    }

    //Копирования
    public Name(Name name){
        this.surname = name.surname;
        this.personalName = name.personalName;
        this.patronymic = name.patronymic;
    }

    @Override
    public String toString(){
        String result = "";
        if (isNotEmpty(surname)) {
            result = surname + " ";
        }
        if (isNotEmpty(personalName)){
            result += personalName + " ";
        }
        if (isNotEmpty(patronymic)){
            result += patronymic;
        }
        return result;
    }

    private boolean isNotEmpty(String str) {
        return str != null;
    }
}

