package LB07;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        // Створення телефонної книги (HashMap)
        Map<String, String> phoneBook = new HashMap<>();

        // Додавання елементів в книгу (прізвище - номер телефону)
        phoneBook.put("Сміт", "1234567890");
        phoneBook.put("Джонсон", "9876543210");
        phoneBook.put("Девіс", "4567890123");
        phoneBook.put("Міллер", "7890123456");
        phoneBook.put("Томпсон", "2345678901");
        phoneBook.put("Вільямс", "9012345678");
        phoneBook.put("Тейлор", "5678901234");
        phoneBook.put("Лі", "0123456789");
        phoneBook.put("Андерсон", "3456789012");
        phoneBook.put("Мартінес", "6789012345");

        // Виведення всіх записів з книги
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + ", Номер телефону: " + entry.getValue());
        }

        // Пошук номера телефону за прізвищем
        String surname = "Джонсон";
        if (phoneBook.containsKey(surname)) {
            String phoneNumber = phoneBook.get(surname);
            System.out.println("Номер телефону для прізвища " + surname + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній абонент з прізвищем " + surname);
        }

        // Видалення запису з книги
        phoneBook.remove("Міллер");

        // Виведення кількості записів у книзі
        int size = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + size);
    }
}