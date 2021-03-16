import java.util.*;

public class solo {
    public static void Car() {
        //        класс Car
//        поля: марка, год выпуска
//        сеты: если год выпуска меньше 2000 - ставится 2000 по умолчанию
//        если марка не указана (null или "") - марка по умолчанию, пусть сам выберет
//        геты: марка, год выпуска
//        отдельно получение "возраста" (год выпуска - 2000)
        Car car1 = new Car("ghg", 2005);

        System.out.println(car1.getAge());
        System.out.println(car1.getStamp());
    }

    public static void People() {
        PeopleName man = new PeopleName("Rudi", "Pachanin", "LOX");

        People human = new People(man, 22);
        human.setCountry("USA");
        human.setNickName("Neo");
        System.out.println(human);


    }

    public void Polindrom() {
        // Выяснить полиндромная ли это строкам "Лёша на полке клопа нашёл"
        String palindrome = "Лёша на полке клопа нашёл".replace(" ", "").toLowerCase();
        StringBuffer pali = new StringBuffer(palindrome);
        System.out.println(palindrome);
        String pal = pali.reverse().toString();
        System.out.println(pali);

        if (palindrome.equals(pal)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }

    public void Calculi() {
        Calculator move = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        move.setX1(scanner.nextInt());
        System.out.print("Введите знак: ");
        move.setSign(scanner.next());
        System.out.print("Веедите 2 чилсо: ");
        move.setX2(scanner.nextInt());
        move.choice();
    }

    public static void sortArea() {
        Shapes circle = new Circle(15);
        Shapes square = new Square(5);
        Shapes rectangle = new Rectangle(10, 6);
        ArrayList<Shapes> sort = new ArrayList<>();
        sort.addAll(Arrays.asList(circle, square, rectangle));
        for (Shapes x : sort) {
            System.out.println(x.area());
        }
        sort.sort(Comparator.comparing(Shapes::area));
        System.out.println();
        for (Shapes x : sort) {
            System.out.println(x.area());
        }


    }

    public static void main(String[] args) {
        Car();
        People();
        new solo().Calculi();
        sortArea();
    }
}












