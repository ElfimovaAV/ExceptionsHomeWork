package seminar3;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class ConsoleReader implements InfoReader {
    private Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public UserInfo readInfo() throws UserInfoException {
        while (true) {
            System.out.println("Enter the data separated by space: Surname Name Patronymic birthdate (dd.mm.yyyy) phone  sex (f / m)");

            try {
                String input = scanner.nextLine();
                String[] info = input.split(" ");

                if (info.length < 6) {
                    throw new UserInfoException("Insufficient data, try again");
                }
                if (info.length > 6) {
                    throw new UserInfoException("Extra data, try again");
                }

                LocalDate birthDate = parseBirthDate(info[3]);
                long phoneNumber = parsePhoneNumber(info[4]);
                UserGender gender = parseGender(info[5]);

                return new UserInfo(info[0], info[1], info[2], birthDate, phoneNumber, gender);
            } catch (ParseException | NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private LocalDate parseBirthDate(String birthDateString) throws ParseException {
        try {
            return LocalDate.parse(birthDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            throw new ParseException("Invalid birthdate format");
        }
    }

    private long parsePhoneNumber(String phoneNumberString) throws ParseException {
        try {
            return Long.parseLong(phoneNumberString);
        } catch (NumberFormatException e) {
            throw new ParseException("Invalid phone number format");
        }
    }

    private UserGender parseGender(String genderString) throws ParseException {
        if (genderString.equalsIgnoreCase("m")) {
            return UserGender.MALE;
        } else if (genderString.equalsIgnoreCase("f")) {
            return UserGender.FEMALE;
        } else {
            throw new ParseException("Invalid gender format");
        }
    }
}
