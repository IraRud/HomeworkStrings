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

        /* Задание 2. Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф. И. О. сотрудников,
        полностью написанные заглавными буквами (верхним регистром). Напишите программу, которая изменит написание Ф. И. О.
        сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы. В качестве строки с исходными данными используйте
        строку fullName. Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”*/
        System.out.println("\nЗадание 2.");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);
    }
}
