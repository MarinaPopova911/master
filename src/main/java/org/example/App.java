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
    private static String printArray(int[] array) {
        String result = "(";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i] + " ";
        }
        result = result.trim() + ")";
        return result;
    }

    /**
     * Функция генерации массива
     *
     * @param length длина массива
     * @param min    минимальный элемент массива
     * @param max    максимльный элемент массива
     * @return сгенерированный массив
     */
    public static int[] rndArray(Integer length, Integer min, Integer max) {
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
    public static int[] bubleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    Integer temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Функция поиска суммы элементов массива
     *
     * @param array массив, сумму элементов которого необходимо вычислить
     * @return вычисленная сумма
     */
    public static Integer sumArray(int[] array) {
        Integer sumElement = 0;
        for (int i = 0; i < array.length; i++) {
            sumElement = sumElement + array[i];
        }
        return sumElement;
    }

    /**
     * Функция поиска чётных элементов массива
     *
     * @param array введенный массив
     * @return чётные элементы массива
     */
    public static String evenNumbers(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result = result + array[i] + " ";
            }
        }
        if (result.equals("")) {
            return "У массива нет четных элементов";
        } else {
            return String.format("Чётные элементы массива: %s", result.trim());
        }
    }

    /**
     * Функция удаления элемента массива по индексу
     *
     * @param array исходный массив
     */
    public static int[] removeElement(int[] array, int idx) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i != idx) {
                int newIndex = (i < idx) ? i : i - 1;
                newArray[newIndex] = array[i];
            }
        }
        return newArray;
    }

    /**
     * Функция изменения порядка следования элементов массива
     *
     * @param array исходный массив
     */
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }
        String newStr = new String(charArray);
        return newStr;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        array = rndArray(10, 7, 30);
        System.out.println(printArray(array));
        System.out.println(printArray(bubleSort(array)));
        System.out.println(String.format("Сумма элементов массива равна: %d", sumArray(array)));
        System.out.println(evenNumbers(array));
        System.out.println(printArray(removeElement(array, 1)));
        System.out.println(printArray(reverseArray(array)));
        String str = "Hello world";
        System.out.println(reverseString(str));
    }
}