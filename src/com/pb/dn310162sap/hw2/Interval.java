package com.pb.dn310162sap.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Для выхода из программы введите любой буквенный символ");
        while (true) {
            System.out.print("Введите значение операнда a: ");
            try {
                int a = scan.nextInt();
                if (a >= 0 && a < 15) {
                    System.out.println("Число 'a' в диапазоне [0 - 14]");
                } else if (a >= 15 && a < 35) {
                    System.out.println("Число 'a' в диапазоне [15 - 35]");
                } else if (a >= 36 && a < 50) {
                    System.out.println("Число 'a' в диапазоне [36 - 50]");
                } else if (a >= 51 && a < 101) {
                    System.out.println("Число 'a' в диапазоне [51 - 100]");
                } else {
                    System.out.println("Число 'a' вне диапазона условий");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода, программа завершена.");
                return;
            }
        }

    }
}
