package seminar3;

import java.time.LocalDate;

public class UserInfo {

    private String surname;
    private String name;
    private String patronymic;
    private LocalDate birthDate;
    private long phoneNumber;
    private UserGender gender;

    public UserInfo(String surname, String name, String patronymic, LocalDate birthDate,
                    long phoneNumber, UserGender gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public UserGender getGender() {
        return gender;
    }

    public String toString() {
        return "UserInfo {" +
                "surname: " + surname + ", name: " + name + ", patronymic: "
                + patronymic + ", birthDate: " + birthDate + ", gender: " + gender + '}';
    }
}