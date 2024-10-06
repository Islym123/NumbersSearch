package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arraySize = 1000;
        int maxValue = 10000;
        int[] numbers = new int[arraySize];

        // Заполнение массива случайными числами
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(maxValue) + 1;  // Генерация чисел от 1 до 10000
        }

        // Поиск числа кратного 14, чётного и являющегося произведением двух чисел из массива
        boolean found = false;  // Флаг для отслеживания, найдено ли число
        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                int product = numbers[i] * numbers[j];

                // Проверка условия: кратность 14, чётность и произведение двух чисел
                if (product <= maxValue && product % 14 == 0 && product % 2 == 0) {
                    System.out.println("Найдено число: " + product + " = " + numbers[i] + " * " + numbers[j]);
                    found = true;
                    break; // Прерывание после нахождения первого подходящего числа
                }
            }
            if (found) break;  // Прерывание внешнего цикла, если число найдено
        }

        if (!found) {
            System.out.println("Число, удовлетворяющее условиям, не найдено.");
        }
    }
}
