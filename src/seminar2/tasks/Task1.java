/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

package seminar2.tasks;

import java.util.Scanner;

public class Task1 {

    public static float showValue(){
        boolean flag = true;
        float numb = 0;
        Scanner iscanner = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter fractional number: ");
            try {
                numb = Float.parseFloat(iscanner.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid format of the entered value");
            }
        }
        return numb;
    }

}