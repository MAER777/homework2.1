import task1.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static int changeValue(int value) {
        int value1 = value - 11;
        return value1;
    }

//    public static Integer changeValue(Integer value) {
//        value = 22;
//        return value;
//    }

    public static Integer [] changeValue(Integer[] value) {
        value = new Integer[] {1,2};
        return value;
    }

    public static Integer [] changeValue2(Integer[] value) {
        value = new Integer[] {90, value[1]};
        return value;
    }
    public static void task1() {
        int value = 33;
        System.out.println("value = " + value);
        System.out.println("changeValue(value) = " + changeValue(value));
        System.out.println("value = " + value);
//        Вопрос: если распечатать переменную в методе main, то какое у нее будет значение?
//        Если печатать с использованием метода, то будет 22, потому что метод хранит в себе данное значение, но оно не изменяет саму переменную value.
//        Если захоти распечатать переменную value, то будет 33, потому что в методе была использована лишь копия.
    }

    public static void task2() {
        Integer value = 33;
        System.out.println(value);
        System.out.println("changeValue(value) = " + changeValue(value));
        value = changeValue(value);
        System.out.println(value);
//        Вопрос: если распечатать переменную в методе main, то какое у нее будет значение?
//        Значения будут разные т.к метод ссылается на одну переменную, а в методе main осталась ссылка на свою переменную
//        В main она не изменилась. Так же как и в 1 задаче.
    }

    public static void task3() {
        Integer[] value = {3,4};
        System.out.println(Arrays.toString(value));
        System.out.println(Arrays.toString(changeValue(value)));
        System.out.println(Arrays.toString(value));
        value = changeValue(value);
        System.out.println(Arrays.toString(value));
//        Вопрос: если распечатать массив в методе main, то какие у него будут значения?
//        То же самое, что и с первыми задачами, если не изменять в main значения value, то даже
//        Вызывая просто метод, мы лишь создаем копию-ссылку на переменную в методе change, но не изменяем ничего в методе main.
    }

    public static void task4() {
        Integer[] value = {3,4};
        System.out.println(Arrays.toString(value));
        System.out.println(Arrays.toString(changeValue2(value)));
//        Вопрос: если распечатать массив в методе main, то какие у него будут значения?
//        Массив в main не меняется, создается копия с заданным значением из метода change.
    }

    public static void task5() {
        Person ilyaLagutenko = new Person("Lyapis", "Trubetskoy");
        System.out.println(ilyaLagutenko.toString());
        ilyaLagutenko.changePerson();
        System.out.println(ilyaLagutenko.toString());
//        Вопрос: если распечатать переменную в методе main, то какое у нее будет значение?
//        Значения в переменной после вызова метода изменяться, и будут те что в методе указано.
    }

    public static void task6() {
        Person ilyaLagutenko = new Person("Lyapis", "Trubetskoy");
        System.out.println(ilyaLagutenko.toString());
        ilyaLagutenko.changePerson1(ilyaLagutenko);
        System.out.println(ilyaLagutenko.toString());
    }
}