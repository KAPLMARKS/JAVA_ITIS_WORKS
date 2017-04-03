package com.company;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();

        for(int i=0; i<10; i++) {
            queue.push(3);
        }
        while(queue.size() > 0) {
// Мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки
            int a = queue.pull(3);
            System.out.println(a);
            System.out.println("Размер очереди:" + queue.size());
        }
    }
}
