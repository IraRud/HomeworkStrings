package skypro.java.course1.hw_1;

public class Task_123 {
    public static void main(String[] args) {
        /* Задание 1. Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся внеструктурированном
        формате, и бухгалтерия попросила написать программу, в которой можно работать с Ф. И. О. сотрудников. Выведите
        в консоль фразу: “ФИО сотрудника — ….” В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”. */
        System.out.println("\nЗадание 1.");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("ФИО сотрудника полностью - " + fullName);
    }
}
