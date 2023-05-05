// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n). Перейти по ссылке, реализовать формулу на Java.

package Homework_1;

import java.util.Scanner;

public class 1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}