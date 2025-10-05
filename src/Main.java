import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //1.2
            Human human1 = new Human("Клеопатра", 152);
            Human human2 = new Human("Пушкин", 167);
            Human human3 = new Human("Владимир", 189);

            System.out.println(human1);
            System.out.println(human2);
            System.out.println(human3);

            System.out.println("Создайте человека.");
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            System.out.print("Введите рост (см): ");
            int height = scanner.nextInt();
            Human human4 = new Human(name, height);
            System.out.println("Созданный человек: " + human4);
//
            //1.3
            Name name1 = new Name("Клеопатра");
            Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
            Name name3 = new Name("Маяковский", "Владимир");

            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);

            System.out.println("Создайте имя.");
            scanner.nextLine();
            System.out.print("Введите фамилию (если неизвестна, оставьте строку пустой): ");
            String surname = scanner.nextLine();
            System.out.print("Введите имя (если неизвестно, оставьте строку пустой): ");
            String personalName = scanner.nextLine();
            System.out.print("Введите отчество (если неизвестно, оставьте строку пустой): ");
            String patronymic = scanner.nextLine();
            Name name4 = new Name(surname, personalName, patronymic);
            System.out.println("Созданное имя: " + name4);

            //2.2
            HumanName humanName1 = new HumanName(name1, human1.getHeight());
            HumanName humanName2 = new HumanName(name2, human2.getHeight());
            HumanName humanName3 = new HumanName(name3, human3.getHeight());
            HumanName humanName4 = new HumanName(name4, human4.getHeight());

            System.out.println(humanName1);
            System.out.println(humanName2);
            System.out.println(humanName3);
            System.out.println("Созданный: " + humanName4);

//            //3.3 и 3.5
//            Cities cityA = new Cities("A");
//            Cities cityB = new Cities("B");
//            Cities cityC = new Cities("C");
//            Cities cityD = new Cities("D");
//            Cities cityE = new Cities("E");
//            Cities cityF = new Cities("F");
//
              //3.3
//            cityA.addWay(cityB, 5);
//            cityA.addWay(cityD, 6);
//            cityA.addWay(cityF, 1);
//
//            cityB.addWay(cityA, 5);
//            cityB.addWay(cityC, 3);
//
//            cityC.addWay(cityB, 3);
//            cityC.addWay(cityD, 4);
//
//            cityD.addWay(cityA, 6);
//            cityD.addWay(cityC, 4);
//            cityD.addWay(cityE, 2);
//
//            cityE.addWay(cityF, 2);
//
//            cityF.addWay(cityB, 1);
//            cityF.addWay(cityE, 2);
//
//            System.out.println("Доступные маршруты.");
//            System.out.println(cityA);
//            System.out.println(cityB);
//            System.out.println(cityC);
//            System.out.println(cityD);
//            System.out.println(cityE);
//            System.out.println(cityF);
//
//            //4.8
//            Map<Cities, Integer> waysA = new HashMap<>();
//            Map<Cities, Integer> waysB = new HashMap<>();
//            Map<Cities, Integer> waysC = new HashMap<>();
//            Map<Cities, Integer> waysD = new HashMap<>();
//            Map<Cities, Integer> waysE = new HashMap<>();
//            Map<Cities, Integer> waysF = new HashMap<>();
//
//            waysA.put(cityB, 5);
//            waysA.put(cityD, 6);
//            waysA.put(cityF, 1);
//
//            waysB.put(cityA, 5);
//            waysB.put(cityC, 3);
//
//            waysC.put(cityB, 3);
//            waysC.put(cityD, 4);
//
//            waysD.put(cityA, 6);
//            waysD.put(cityC, 4);
//            waysD.put(cityE, 2);
//
//            waysE.put(cityF, 2);
//
//            waysF.put(cityB, 1);
//            waysF.put(cityE, 2);
//
//            CreateCities A = new CreateCities("A", waysA);
//            CreateCities B = new CreateCities("B", waysB);
//            CreateCities C = new CreateCities("C", waysC);
//            CreateCities D = new CreateCities("D", waysD);
//            CreateCities E = new CreateCities("E", waysE);
//            CreateCities F = new CreateCities("F", waysF);
//
//            System.out.println("Доступные маршруты.");
//            System.out.println(A);
//            System.out.println(B);
//            System.out.println(C);
//            System.out.println(D);
//            System.out.println(E);
//            System.out.println(F);

//            //5.5
//            Fraction f1 = new Fraction(1, 7);
//            Fraction f2 = new Fraction();
//            Fraction f3 = new Fraction(-2, -5);
//            Fraction f4 = new Fraction(4, 8);
//            Fraction f5 = new Fraction(0, 9);
//            Fraction f6 = new Fraction(3, -10);
//
//            System.out.println("Созданные дроби:");
//            System.out.println("f1 = " + f1);
//            System.out.println("f2 = " + f2);
//            System.out.println("f3 = " + f3);
//            System.out.println("f4 = " + f4);
//            System.out.println("f5 = " + f5);
//            System.out.println("f6 = " + f6);
//
//            System.out.println("Создайте свою дробь (на неё будем делить).");
//            System.out.print("Введите числитель: ");
//            int numerator = scanner.nextInt();
//            System.out.print("Введите знаменатель: ");
//            int denominator = scanner.nextInt();
//            Fraction f7 = new Fraction(numerator, denominator);
//            System.out.println("Созданная вами дробь f7 = " + f7);
//
//            System.out.println("Арифметические операции: ");
//
//            // Сложение дробей
//            Fraction sumFraction = f1.sum(f2);
//            System.out.println(f1 + " + " + f2 + " = " + sumFraction);
//
//            // Сложение дроби и целого числа
//            Fraction sumNumber = f1.sum(2);
//            System.out.println(f1 + " + 2 = " + sumNumber);
//
//            // Вычитание дробей
//            Fraction diffFraction = f3.difference(f4);
//            System.out.println(f3 + " - " + f4 + " = " + diffFraction);
//
//            // Вычитание дроби и целого числа
//            Fraction diffNumber = f3.difference(7);
//            System.out.println(f3 + " - 7 = " + diffNumber);
//
//            // Умножение дробей
//            Fraction compFraction = f1.composition(f6);
//            System.out.println(f1 + " * " + f6 + " = " + compFraction);
//
//            // Умножение дроби и целого числа
//            Fraction compNumber = f4.composition(16);
//            System.out.println(f2 + " * 16 = " + compNumber);
//
//            // Деление дробей
//            Fraction divFraction = f4.division(f7);
//            System.out.println(f4 + " / " + f7 + " = " + divFraction);
//
//            // Деление дроби и целого числа
//            Fraction divNumber = f3.division(2);
//            System.out.println(f3 + " / 2 = " + divNumber);
//
//            Fraction result = f1.sum(f2).division(f3).difference(5);
//            System.out.println("(" + f1 + " + " + f2 + ") /" + f3 + " - " + "5 = " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        scanner.close();
    }
}