package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static CsvFile csvFile;
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу по обработке csv файлов");
        while (true) {
            System.out.println("\n1: Прочитать CSV файл");
            System.out.println("2: Просмотреть индексацию заголовков");
            System.out.println("3: Выполнить поиск");
            System.out.println("0: Выход");
            int choice = 0;
            Scanner in = new Scanner(System.in);
            try {
                choice = Integer.parseInt(in.next());
            }catch (NumberFormatException e) {
                System.out.println("В каестве команды могут быть только цифровые значения");
            }

            switch (choice) { case
                1:
                try {
                    readCsv();
                } catch (IOException e) {
                    System.out.println("К сожалению, произошла ошибка при чтении: " + e.getMessage());
                }
                break;
                case 2:
                    if (csvFile != null) {
                        readHeaders();
                    } else {
                        System.out.println("Сначала нужно прочитать файл");
                    }
                    break;
                case 3:
                    if (csvFile == null) {
                        System.out.println("Сначала нужно прочитать файл");
                        break;
                    }
                    System.out.println("Введите имя файла, в который будут сохранены результаты");
                    String fileName;
                    String searchName;
                    int index;
                    fileName = in.next();
                    System.out.println("Введите искомую подстроку");
                    searchName = in.next();
                    System.out.println("Введите индекс столбца (посмотреть можно в меню)");
                    index = in.nextInt();
                    try {
                        search(fileName, searchName, index);
                    } catch (IOException e) {
                        System.out.println("Поиск не удался, причина: " + e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("До свидания");
                    return;
                default:
                    System.out.println("Команда не существует");
            }
        }
    }

    public static void search(String fileName, String search, int index) throws IOException {
        csvFile.saveCsvFile(csvFile.search(search, index), fileName);
    }

    public static void readCsv() throws IOException {
        System.out.println("Введите файл и разделитель: ");
        Scanner in = new Scanner(System.in);
        csvFile = new CsvFile(in.next(), in.next());
        System.out.println("Успешно прочитано");
    }

    public static void readHeaders() {
        for (int i = 0; i < csvFile.getNames().length; i++) {
            System.out.println(i + ": " + csvFile.getNames()[i]);
        }
    }
}
