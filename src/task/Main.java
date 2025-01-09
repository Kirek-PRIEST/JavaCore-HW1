package task;

/**
 * Класс для входа в программу
 */
public class Main {
    /**
     * в переменной result меняем числа, чтобы получить разные результаты для вывода
     *
     * @param args - стандартный аргумент для метода main
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));

    }
}
