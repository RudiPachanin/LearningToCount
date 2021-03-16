public class People {
    private PeopleName name;
    private int age;
    private String country;

    public People(PeopleName name, int age) {
        setAge(age);
        this.name=name;
    }

    @Override
    public String toString() {
        return "People" +
                "name=" + name +
                ", age=" + age +
                ", country='" + country + '\''
                ;
    }

    public PeopleName getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNickName() {
        return name.getNickName();
    }

    public void setNickName(String nickName) {
        this.name.setNickName(nickName);
    }


}
