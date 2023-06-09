package LB08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberFile {
    public static void main(String[] args) {
        // Отримуємо параметри командного рядка
        if (args.length != 4) {
            System.out.println("Usage: java RandomNumberFile <filename> <numberCount> <minValue> <maxValue>");
            return;
        }

        String filename = args[0];
        int numberCount = Integer.parseInt(args[1]);
        int minValue = Integer.parseInt(args[2]);
        int maxValue = Integer.parseInt(args[3]);

        // Перевірка існування файлу
        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
                return;
            }
        }

        // Запис послідовності випадкових чисел у файл
        try (FileWriter writer = new FileWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < numberCount; i++) {
                int randomNumber = random.nextInt(maxValue - minValue + 1) + minValue;
                writer.write(String.valueOf(randomNumber));
                writer.write(System.lineSeparator());
            }
            System.out.println("Numbers successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Читання інформації з файлу та виведення на консоль
        try (FileReader reader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

//javac RandomNumberFile.java
//java RandomNumberFile myfile.txt 10 1 100
