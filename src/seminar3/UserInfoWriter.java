package seminar3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInfoWriter implements InfoWriter {

    @Override
    public void writeInfo (UserInfo userInfo) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = userInfo.getSurname();
        FileWriter writer = new FileWriter(fileName, true);
        String userInfoString = String.join(" ",
                userInfo.getSurname(),
                userInfo.getName(),
                userInfo.getPatronymic(),
                userInfo.getBirthDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                String.valueOf(userInfo.getPhoneNumber()),
                userInfo.getGender().toString());
        writer.write(userInfoString + "\n");
        writer.close();
        System.out.println("The data has been successfully written to the file: " +
                fileName);
    }
}
