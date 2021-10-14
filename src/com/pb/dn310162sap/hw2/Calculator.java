package com.pb.dn310162sap.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int c = 0;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Введите значение операнда a: ");
            int a = scan.nextInt();
            System.out.print("Введите значение операнда b: ");
            int b = scan.nextInt();
            System.out.print("Введите знак операции (+, -, /, *): ");
            char sign = scan.next().charAt(0);

            switch (sign) {
                case '*':
                    c = a * b;
                    break;
                case '/':
                    try {
                        c = a / b;
                    } catch (Exception e) {
                        System.out.println("Щось пішло не так...");
                    }
                    break;
                case '+':
                    c = a + b;
                    break;
                case '-':
                    c = a - b;
                    break;
            }
            if (b == 0 && sign == '/') {
                System.out.print("Делить на ноль не кошерно..");
            } else
                System.out.println("Результат: " + a + " " + sign + " " + b + " = " + c);
        } catch (
                Exception e) {
            System.out.println("Ошибка ввода, введите целое число");
        }
    }
}
