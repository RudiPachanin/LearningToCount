import java.time.Year;
import java.util.Calendar;

public class Car {


    private String stamp;
    private int year;

    //        класс Car
//        поля: марка, год выпуска
//        сеты: если год выпуска меньше 2000 - ставится 2000 по умолчанию
//        если марка не указана (null или "") - марка по умолчанию, пусть сам выберет
//        геты: марка, год выпуска
//        отдельно получение "возраста" (год выпуска - 2000)

    public Car(String stamp, int year) {
        setYear(year);
        setStamp(stamp);
    }

    public Car() {
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        if (stamp == null || stamp.equals("")) {
            this.stamp = "ВАЗ";
            return;
        }
        this.stamp = stamp;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {

        return year - 2000;
    }

    public void setYear(int year) {
        if (year < 2000) {
            year = 2000;
        }
        this.year = year;
    }
}
