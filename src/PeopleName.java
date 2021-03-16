public class PeopleName {
    private String firstName;
    private String lastName;
    private String nickName;

    public PeopleName(String firstName, String lastName, String nickName) {
        setFirstName(firstName);
        setLastName(lastName);
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "PeopleName" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\''
                ;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.equals("")) {
            this.firstName = ("Анонимус");
            return;
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.equals("")) {
            this.lastName = ("Анонимус");
            return;
        }
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
