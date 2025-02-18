public class Main {
    public static void main(String[] args) {

        String task = "Task-";
        System.out.println(task + 1);
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName;

        fullName = firstName + " " + middleName + " " + lastName;

                System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println(task + 2);
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета - %s%n", fullName.toUpperCase());

        System.out.println(task + 3);

        fullName = "Иванов Семён Семёнович";
        String corretedFullName = fullName.replace("ё", "е")
        System.out.printf("Данные Ф. И. О. сотрудника - %s%n", fullName);
    }
}