/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

package seminar2.tasks;

import java.util.Scanner;

public class Task4 {
    public static void enterString(){
        boolean flag = true;
        String str = "";
        Scanner iscanner = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter a string: ");
            try {
                str = iscanner.nextLine();
                if (str.isEmpty()) {
                    throw new RuntimeException("You enter an empty string!");
                } else flag = false;

            } catch (RuntimeException e) {
                System.out.println("\u001B[43m"+ "\u001B[30m" + e.getMessage() + "\u001B[0m");
            }
        }
        System.out.println("You enter " + str);
    }
}