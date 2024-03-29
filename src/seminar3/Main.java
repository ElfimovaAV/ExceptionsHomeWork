package seminar3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        InfoReader infoReader = new ConsoleReader(scanner);
        InfoWriter infoWriter = new UserInfoWriter();

        try {
            UserInfo userInfo = infoReader.readInfo();
            infoWriter.writeInfo(userInfo);
        } catch (UserInfoException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

