package org.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    /**
     * Функция поиска минимума среди трех чисел
     *
     * @param a первое число
     * @param b второе число
     * @param c третье число
     * @return минимальное из трех чисел
     */

    private static Integer min(Integer a, Integer b, Integer c) {
        Integer result;
        if (a <= b && a <= c) {
            result = a;
        } else if (b <= a && b <= c) {
            result = b;
        } else {
            result = c;
        }
        return result;
    }

    /**
     * Функция определения високосного года
     *
     * @param year год
     * @return год является/не является високосным
     */
    public static String leapYear(Integer year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }

    }

    /**
     * *Вычисление значения функции (4*(x - 5)^2 + 7*x – 10)/(x^4+1)
     *
     * @param x
     * @return значение функции (4*(x - 5)^2 + 7*x – 10)/(x^4+1)
     */
    public static Double func(Integer x) {
        Double res = ((4 * Math.pow((x - 5), 2) + 7 * x - 10)) / (Math.pow(x, 4) + 1);
        return res;
    }

    /**
     * Функция определения четверти
     *
     * @param x значение по оси абсцисс
     * @param y значение по оси ординат
     * @return номер четверти
     */
    public static String quadrant(Integer x, Integer y) {
        String res;
        if (x < 0) {
            if (y > 0) {
                res = "II четверть";
            } else {
                res = "III четверть";
            }
        } else if (y > 0) {
            res = "I четверть";
        } else {
            res = "IV четверть";
        }
        return res;
    }

    /**
     * Функция определения существования треугольника
     *
     * @param a первая сторона треугольника
     * @param b вторая сторона треугольника
     * @param c третья сторона треугольника
     * @return треугольник существует/не существует
     */
    public static String triangle(Integer a, Integer b, Integer c) {
        if (a + b > c || a + c > b || b + c > a) {
            return "треугольник со сторонами (" + a + ";" + b + ";" + c + ") существует";
        } else {
            return "треугольник со сторонами (" + a + ";" + b + ";" + c + ") не существует";
        }
    }

    /**
     * Решение квадратного уравнения a*x^2 + b*x + c = 0
     *
     * @param a
     * @param b
     * @param c
     * @return корни уравнения
     */
    public static String equation(Integer a, Integer b, Integer c) {
        String roots;
        Double d;
        d = Math.pow(b, 2) - (4 * a * c);
        if (d < 0) {
            roots = "Корней нет";
        } else if (d == 0) {
            roots = "Уравнение имеет один корень : " + (-b) / (2 * a);
        } else {
            roots = "Дискриминант > 0, уравнение имеет два корня : x1 = " + ((-b) + Math.sqrt(d)) / (2 * a) + " x2 = " + ((-b) - Math.sqrt(d)) / (2 * a);
        }
        return roots;
    }

    /**
     * Функция упорядочивания трёх чисел
     *
     * @param a первое число
     * @param b второе число
     * @param c третье число
     * @return Числа в порядке возрастания
     */
    public static String numOrder(Integer a, Integer b, Integer c) {
        Integer x;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        if (b > c) {
            x = b;
            b = c;
            c = x;
        }
        return "Числа в порядке возрастания " + a + ", " + b + ", " + c;
    }

    public static void main(String[] args) {
        System.out.println(min(0, 3, -1));
        System.out.println(leapYear(2024));
        System.out.println(quadrant(3, -5));
        System.out.println(triangle(1, 0, 0));
        System.out.println(equation(1, 3, -4));
        System.out.println("Значение функции равно " + func(1));
        System.out.println(numOrder(34, 1, 11));
    }
}
