package JavaClasses.MainTask;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Runner {
    public static void main(String[] args) {
        Student[] students = {new Student(21235, "Петров", "Александр",
                "Сергеевич", LocalDate.of(1991, 2, 23), "Улица Победы 24 кв.298",
                295486596, "ПГС", 2, "ПС"),
                new Student(74375, "Сидоров", "Андрей",
                        "Владимирович", LocalDate.of(1989, 3, 29), "Улица Советская 54 кв.45",
                        291234567, "ПГС", 1, "ПС"),
                new Student(54986, "Иванов", "Владимир",
                        "Андреевич", LocalDate.of(1988, 4, 11), "Улица Ефремова 76 кв.52",
                        292345678, "ПГС", 3, "ПК"),
                new Student(31426, "Смирнов", "Павел",
                        "Николаевич", LocalDate.of(1990, 7, 15), "Улица Котовского 54 кв.63",
                        293456789, "Экономический", 3, "ТД"),
                new Student(79625, "Кузнецов", "Александр",
                        "Павлович", LocalDate.of(1987, 8, 18), "Улица Ленина 23 кв.85",
                        294567891, "Экономический", 1, "ЭТ"),
                new Student(78456, "Соколов", "Евгений",
                        "Сергеевич", LocalDate.of(1995, 11, 21), "Улица Володарского 87 кв.96",
                        295678912, "Экономический", 2, "ЭТ"),
                new Student(32056, "Попов", "Кирилл",
                        "Владимирович", LocalDate.of(1990, 12, 12), "Улица Жукова 36 кв.123",
                        297896541, "Строительный", 1, "ИД"),
                new Student(90563, "Лебедев", "Владислав",
                        "Сергеевич", LocalDate.of(1988, 5, 30), "Улица Головацкого 58 кв.78",
                        299658741, "Строительный", 4, "УТ"),
                new Student(56389, "Козлов", "Владимир",
                        "Петрович", LocalDate.of(1992, 7, 1), "Улица Ильича 47 кв.104",
                        293685236, "ПГС", 5, "ПК"),
                new Student(74589, "Зайцев", "Николай",
                        "Александрович", LocalDate.of(1987, 3, 6), "Улица Жемчужная 96 кв.75",
                        297652148, "Строительный", 4, "УТ"),
                new Student(20135, "Волков", "Петр",
                        "Дмитриевич", LocalDate.of(1993, 1, 8), "Улица Гагарина 89 кв.52",
                        293548687, "Экономический", 5, "ТД")};
        printStudentFacultyList("ПГС", students);
        System.out.println();
        printStudentFacultyAndCourseList("Строительный", 4, students);
        System.out.println();
        printStudentListSortedByDateOfBirth(LocalDate.of(1991, 1, 1), students);
        System.out.println();
        printStudentGroupList("ТД", students);
    }

    private static void printStudentFacultyList(String facultyName, Student[] students) {
        System.out.println("Студенты фаультета " + facultyName);
        for (Student student : students) {
            if (student.getFaculty().equals(facultyName)) {
                System.out.println(student);
            }
        }
    }

    private static void printStudentFacultyAndCourseList(String facultyName, int course, Student[] students) {
        System.out.println("Студенты фаультета " + facultyName + " :" + course + " курса");
        for (Student student : students) {
            if (student.getFaculty().equals(facultyName) && student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    private static void printStudentListSortedByDateOfBirth(LocalDate date, Student[] students) {
        System.out.println("Студенты родившеяся после " + date);
        for (Student student : students) {
            if (ChronoUnit.DAYS.between(date, student.getDateOfBirth()) >= 0) {
                System.out.println(student);
            }
        }
    }

    private static void printStudentGroupList(String groupName, Student[] students) {
        System.out.println("Студенты группы " + groupName);
        for (Student student : students) {
            if (student.getGroup().equals(groupName)) {
                System.out.println(student);
            }
        }
    }
}
