// =====================================
// 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// =====================================

import java.util.LinkedList;

public class zadacha1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber()); // добавляет рандомные числа
        }
        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            System.out.print(list.getLast() + ", ");  // возвращает последний элемент
            list.removeLast(); // удаляет            // 

        }
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}