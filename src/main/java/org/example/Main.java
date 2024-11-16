package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Пример вызова каждого из методов с примером ввода и вывода
        System.out.println("Пример работы метода A01:");
        String[] a01Args = {"Данил"};
        taskA.A01(a01Args);  // Пример с аргументом "Данил"
        System.out.println();

        System.out.println("Пример работы метода A02:");
        if (args.length > 0) {
            // Аргументы передаются через командную строку
            taskA.A02(args);  // Используем аргументы, переданные при запуске программы
        } else {
            System.out.println("Не переданы аргументы для метода A02.");
        }
        System.out.println();

        System.out.println("Пример работы метода A03:");
        // Пример работы A03
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество случайных чисел: ");
        int num = scan.nextInt();
        taskA.A03(new String[]{String.valueOf(num)});  // Ввод количества случайных чисел
        System.out.println();

        System.out.println("Пример работы метода A04:");
        String[] a04Args = {"qwerty"};
        taskA.A04(a04Args);  // Пример с правильным паролем
        System.out.println();

        System.out.println("Пример работы метода A05:");
        String[] a05Args = {"3", "5", "7"};
        taskA.A05(a05Args);  // Пример с аргументами для суммы и произведения
        System.out.println();

        System.out.println("Пример работы метода A06:");
        taskA.A06();  // Пример для вывода информации о разработчике
    }
}
