package org.example;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class taskA {

    // Метод A01: Приветствовать пользователя по имени
    public static void A01(String[] args) {
        if (args.length != 0) {
            System.out.println("Приветствую, " + args[0]);
        } else {
            System.out.println("Задайте свое имя в аргументе!");
        }
    }

    // Метод A02: Вывести аргументы в обратном порядке
    public static void A02(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }

    // Метод A03: Вывести случайные числа
    public static void A03(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            System.out.println("Случайные числа с переходом на новую строку:");
            for (int i = 0; i < num; i++) {
                System.out.println((int) (Math.random() * 20));
            }
            System.out.println();
            System.out.println("Случайные числа без перехода на новую строку:");
            for (int i = 0; i < num; i++) {
                System.out.print((int) (Math.random() * 20) + " ");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите корректное число.");
        }
    }

    // Метод A04: Сравнить введённый пароль с правильным
    public static void A04(String[] args) {
        String pass = "qwerty";
        if (args.length > 0) {
            System.out.println("Вывод: " + Boolean.toString(args[0].equals(pass)));
        } else {
            System.out.println("Введите пароль в аргументах командной строки.");
        }
    }

    // Метод A05: Подсчитать сумму и произведение чисел
    public static void A05(String[] args) {
        if (args.length != 0) {
            int sum = 0;
            int com = 1;
            for (String arg : args) {
                try {
                    int num = Integer.parseInt(arg);
                    sum += num;
                    com *= num;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: все аргументы должны быть числами.");
                    return;
                }
            }
            System.out.println("Сумма аргументов равна " + sum);
            System.out.println("Произведение аргументов равно " + com);
        } else {
            System.out.println("Введите хотя бы одно число.");
        }
    }

    // Метод A06: Информация о разработчике и времени получения/сдачи задания
    public static void A06() {
        System.out.println("Разработчик: Иванов Данил, группа Б762-1");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        System.out.println("Дата и время получения заданий: 07.09.2024 15:20:00");
        System.out.println("Дата и время сдачи заданий:     " + now.format(formatter));
    }
}
