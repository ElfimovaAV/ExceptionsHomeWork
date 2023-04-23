/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/

package seminar1.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {

    public static void classException() {
        try {
            Class.forName("Class1");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("Class Not Found...");
        }
    }

    public static void checkAge(int a) {
        try {
            if (a < 18) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("Eligible for Voting");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("Not Eligible for Voting");
        }
    }

    public static void readFile() {
        try {

            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}