package test;

import ed.ldc.queue.ArrayQueue;

public class ArrayQueueTest {

    public static void rodarTestArray() {

        ArrayQueue<Integer> queue = new ArrayQueue<Integer>(2);

        System.out.println("\n\nTeste de array QUEUE\n");

        System.out.println("Antes do Push: " + queue.size());

        queue.push(10);
        queue.push(20);

        System.out.println("Primeiro:" + queue.peek());
        System.out.println("Ultimo:" + queue.back());
        System.out.println("Tamanho: " + queue.size());

        System.out.println("\n\nTamanho antes do POP: " + queue.size());
        queue.pop();

        System.out.println("Primeiro:" + queue.peek());
        System.out.println("Ultimo:" + queue.back());
        System.out.println("Tamanho: " + queue.size());
    }

}
