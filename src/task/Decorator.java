package task;

/**
 * Класс оформляет результат в строку
 */
public class Decorator {
    /**
     * @param a - результат для вывода
     * @return - отформатированная строка
     */

    public static String decorate(int a) {
        return "Вот ваш результат вычисления: " + a;
    }
}
