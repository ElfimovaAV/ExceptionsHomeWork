/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода
единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

package seminar1.tasks;

public class Task3 {
    public static void divisionOfArrays (int[] arr1, int[] arr2) {
        try {
            if (arr1.length != arr2.length) throw new RuntimeException();
            int[] newarray = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                newarray[i] = arr1[i] / arr2[i];
                System.out.print( newarray[i] + " ");
            }
            System.out.println();
        } catch (ArithmeticException e1) {
            System.out.println(e1);
            System.out.println("Error! - You cannot divide any number with 0");
        } catch (RuntimeException e2) {
            System.out.println(e2);
            System.out.println("Lengths of arrays are not equal");
        }
    }
}
