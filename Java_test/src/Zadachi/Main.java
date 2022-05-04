package Zadachi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите пять чисел!"); // Выводим в консоль запрос
        Scanner sc = new Scanner(System.in); // Вызываем метод сканер получения данных из консоли

        int array [] = new int[5]; // Объявляем массив
        int s = 0; // Обявляем переменную для суммы
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt(); // Получаем числа в массив
        }
        for (int n : array) {
            s = s + n; // Суммируем числа в полученном массиве
        }

        int a = 125; // Объявляем переменную искомого числа

        if(s == a) {
            System.out.println("Вы угадали сумму чисел"); // Выводим в консоль если сумма чисел совпала
        } else if (s > a) {
            System.out.println("Сумма чисел меньше"); // Выводим в консоль если сумма меньше
        }    else {
                System.out.println("Сумма чисел больше"); // Выводим в консоль если сумма больше
        }

    }

}