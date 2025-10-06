public class Fraction {
    //Поля
    private int numerator;
    private int denominator;

    //Свойсва

    public int getNumerator() {

        return numerator;
    }

    public int getDenominator() {

        return denominator;
    }

    public void setNumerator(int numerator) {

        this.numerator = numerator;
        simplification();
    }

    public void setDenominator(int denominator) {
        Validator.validateDenominator(denominator);
        this.denominator = denominator;
        simplification();
    }

    //Конструкторы
    //По умолчанию
    public Fraction(){
        this.numerator = 2;
        this.denominator = 3;
    }

    //С параметрами
    public Fraction(int numerator, int denominator){
        Validator.validateDenominator(denominator);
        this.numerator = numerator;
        this.denominator = denominator;
        simplification();
    }

    //Копирования
    public Fraction(Fraction fraction){
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }

    //Арифметические операции
    //Сумма дробей
    public Fraction sum(Fraction fraction){
        int newNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    //Сумма дроби и целого числа
    public Fraction sum(int number){
        return sum(new Fraction(number, 1));
    }

    //Разность дробей
    public Fraction difference(Fraction fraction){
        int newNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    //Разность дроби и целого числа
    public Fraction difference(int number){
        return difference(new Fraction(number, 1));
    }

    //Произведение дробей
    public Fraction composition(Fraction fraction){
        int newNumerator = this.numerator * fraction.numerator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    //Произведение дроби и целого числа
    public Fraction composition(int number){
        return composition(new Fraction(number, 1));
    }

    //Деление дробей
    public Fraction division(Fraction fraction){
        Validator.validateFraction(fraction);
        int newNumerator = this.numerator * fraction.denominator;
        int newDenominator = this.denominator * fraction.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    //Деление дроби и целого числа
    public Fraction division(int number){
        Validator.validateNumber(number);
        return division(new Fraction(number, 1));
    }

    //Упрощение дроби
    private void simplification(){
        //Знак в числителе
        if (denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }

        //Сокращение дроби
        int shorten = NOD(numerator, denominator);
        numerator /= shorten;
        denominator /= shorten;

    }

    //НОД (метод Евклида)
    private int NOD(int numerator, int denominator){
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        while (denominator != 0){
            int temp = denominator;
            denominator = numerator % denominator;
            numerator = temp;
        }
        return numerator;
    }
}
