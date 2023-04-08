// =====================================
// 2.Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди,
// - dequeue() - возвращает первый элемент из очереди и удаляет его,
// - first() - возвращает первый элемент из очереди, не удаляя.
// =====================================


import java.util.LinkedList;

public class zadacha2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(list, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(list);

        System.out.println(dequeue(list)); // удалили первый элемент
        System.out.println(list);

        System.out.println(first(list)); // вывели первый элемент
        System.out.println(list); 
    }

    public static void enqueue(LinkedList<Integer> list, int num) {// помещает элемент в конец очереди
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) { // возвращает первый элемент из очереди и удаляет его
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) { // возвращает первый элемент из очереди, не удаляя
        int num = list.get(0);
        return num;
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}