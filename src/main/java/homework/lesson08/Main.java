package homework.lesson08;

public class Main {
    public static void main(String[] args) throws IllegalDateException {
        Data date = new Data(-1,1,2012);
        Data date2 = new Data(17,2,2019);
        System.out.println(date.checkDate());
        System.out.println(date2.checkDate());
    }
}
