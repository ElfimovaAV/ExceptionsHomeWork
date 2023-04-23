package seminar1;

import seminar1.tasks.Task1;
import seminar1.tasks.Task2;
import seminar1.tasks.Task3;

public class Main {
    public static void main(String[] args) {
//        Task1.classException();
//        Task1.checkAge(80);
//        Task1.checkAge(17);
//        Task1.readFile();

        int[] array1 = new int[]{5, 9, 12, 80, 45, 14};
        int[] array2 = new int[]{10, 3, 6, 40, 90, 7};
        int[] array3 = new int[]{5, 2};
        int[] array4 = new int[]{5, 3, 9, 41, 0, 15};
//        Task2.differenceOfArrays(array1, array2);
//        Task2.differenceOfArrays(array1, array3);

        Task3.divisionOfArrays(array1, array2);
        Task3.divisionOfArrays(array1, array3);
        Task3.divisionOfArrays(array1, array4);

    }
}