/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих
массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */
package seminar1.tasks;

public class Task2 {
    public static void differenceOfArrays (int[] arr1, int[] arr2) {
        try {
            if (arr1.length != arr2.length) throw new RuntimeException();
            int[] newarray = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                newarray[i] = arr1[i] - arr2[i];
                System.out.print( newarray[i] + " ");
                }
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println(e);
            System.out.println("Lengths of arrays are not equal");
            }
    }
}
