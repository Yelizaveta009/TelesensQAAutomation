package homework.lesson04;

public class Main {
    public static void main(String[] args) {
        Abonent abonentOne = new Abonent(535, "Boris", "Tkachenko", 33, 'm');
        Abonent abonentTwo = new Abonent("Ivan", "Tkachenko", 33, 'm');
        abonentOne.infoPrint();
        abonentTwo.infoPrint();
        abonentTwo.isEqualsById(abonentOne);
    }
}
