package lesson.classroom;
/*3)* "track_23", "track_12", "track_06", "track_22"
	=> отсортировать по номеру из последних двух цифр.Тут возникли сложности*/

import java.util.Arrays;


public class TaskThird {
    public static void main(String[] args) {
        String[] tracks = {"track_23", "track_12", "track_06", "track_22"};
        LastNumbersSort tracksSort = new LastNumbersSort(tracks);
        tracksSort.println();

    }
    public static class LastNumbersSort {
        private String[] array;

        public LastNumbersSort(String[] array) {
            this.array = array;
        }

        public String[] getArray() {
            return array;
        }

        private String firstPart(String track) {
            String firstPart = track.substring(0, 5);
            return firstPart;
        }

        private int secondPart(String track) {
            String secondPart = track.substring(6);
            int a = Integer.parseInt(secondPart);
            return a;
        }

        public LastNumbersSort println() {
            System.out.println(Arrays.toString(array));
            return this;
        }
    }
}






