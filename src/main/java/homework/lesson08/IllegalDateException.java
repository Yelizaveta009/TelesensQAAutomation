package homework.lesson08;

public class IllegalDateException extends Exception {

    public IllegalDateException(String incorrect_date) {
        String error = "Введите корректную дату";
    }

    public String explanation() {
        return "Nonexistent date";
    }
}

