public class Validator {
    public static void validateName(String name){
        if (name == null || name.length() == 0){
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
    }

    public static void validateClassName(String surname, String personalName, String patronymic){
        if ((surname == null ||surname.length() == 0) &&
                (personalName == null ||personalName.length() == 0) &&
                (patronymic == null || patronymic.length() == 0)){
            throw new IllegalArgumentException("ФИО не может быть пустым.");
        }
    }

    public static void validateHeight(int height){
        if (height < 0 || height > 250){
            throw new IllegalArgumentException("Некорректное значение роста человека.");
        }
    }

    public static void validateClassHuman(String name, int height) {
        validateName(name);
        validateHeight(height);
    }

    public static void validateClassHumanName(Name name, int height) {
        validateClassName(name.getSurname(), name.getPersonalName(), name.getPatronymic());
        validateHeight(height);
    }

    public static void validateTitle(String title){
        if (title == null || title.length() == 0){
            throw new IllegalArgumentException("Название города не может быть пустым.");
        }
    }

    public static void validateCost(int cost){
        if (cost <= 0){
            throw new IllegalArgumentException("Некорректное значение стоимости пути.");
        }
    }

    public static void validateDenominator(int denominator){
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
    }

    public static void validateFraction(Fraction fraction) {
        if (fraction.getNumerator() == 0) {
            throw new IllegalArgumentException("Деление на нулевую дробь.");
        }
    }

    public static void validateNumber(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Деление на ноль.");
        }
    }
}
