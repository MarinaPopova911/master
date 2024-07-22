package org.example;

import java.util.Random;

/**
 * Класс Main
 */
public class App {
    /**
     * Функция печати массива
     *
     * @param array массив
     * @return массив в виде строки
     */
    private static void printArray(int[] array) {
        String str = "(";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i] + " ";
        }
        str = str.trim() + ")";
        System.out.println(str);
    }

    /**
     * Функция генерации массива
     *
     * @param length длина массива
     * @param max    максимльный элемент массива
     * @param min    минимальный элемент массива
     * @return сгенерированный массив
     */
    public static int[] rndArray(Integer length, Integer max, Integer min) {
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = min + rnd.nextInt((max - min) + 1);
        }
        return array;
    }

    /**
     * Функция пузырьковой сортировки массива
     *
     * @param array массив
     */
    public static void bubleSort(int[] array) {
        Integer x;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
        printArray(array);
    }

    /**
     * Функция поиска суммы элементов массива
     *
     * @param array массив, сумму элементов которого необходимо вычислить
     * @return вычисленная сумма
     */
    public static Integer sumArray(int[] array) {
        Integer a = 0;
        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
        }
        return a;
    }

    /**
     * Функция поиска чётных элементов массива
     *
     * @param array введенный массив
     * @return чётные элементы массива
     */
    public static String evenNumbers(int[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                str = str + array[i] + " ";
            } else {
                continue;
            }
        }
        if (str == "") {
            return "У массива нет четных элементов";
        } else {
            return String.format("Чётные элементы массива: %s", str.trim());
        }
    }

    /**
     * Функция удаления элемента массива по индексу
     *
     * @param array исходный массив
     */
    public static void remove(int[] array, int idx) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i != idx) {
                int newIndex;
                if (i < idx) {
                    newIndex = i;
                } else {
                    newIndex = i - 1;
                }
                newArray[newIndex] = array[i];
            }
        }
        printArray(newArray);
    }

    /**
     * Функция изменения порядка следования элементов массива
     *
     * @param array исходный массив
     */
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        printArray(array);
    }

    public static void main(String[] args) {
        int[] array = new int[3];
        array = rndArray(10, 30, 7);
        printArray(array);
        bubleSort(array);
        System.out.println(String.format("Сумма элементов массива равна: %d", sumArray(array)));
        System.out.println(evenNumbers(array));
        remove(array, 1);
        reverseArray(array);


    }
}