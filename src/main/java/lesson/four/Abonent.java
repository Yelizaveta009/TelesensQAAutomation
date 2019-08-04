package lesson.four;

public class Abonent {
    private long id = -1;
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public Abonent(long x, String a, String b, int c, char i) {
        this.id = x;
        this.firstName = a;
        this.lastName = b;
        this.age = c;
        this.gender = i;
    }

    public Abonent(String a, String b, int c, char i) {
        this.firstName = a;
        this.lastName = b;
        this.age = c;
        this.gender = i;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void infoPrint() {
        System.out.println("Aбонент");
        System.out.println("Id : " + id);
        System.out.println("Имя : " + firstName);
        System.out.println("Фамилия : " + lastName);
        System.out.println("Возраст : " + age);
        System.out.println("Пол : " + gender);
        System.out.println("-----------------");
    }

    boolean isEqualsById(Abonent abonent) {
        if (this.id == abonent.id && this.id != -1) {
            System.out.println("ID абонентов равны");
            return true;
        } else {
            System.out.println("ID абонентов НЕ равны");
            return false;
        }
    }
}



