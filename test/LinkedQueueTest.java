package test;

import ed.ldc.queue.LinkedQueue;
import ed.ldc.queue.Node;

public class LinkedQueueTest {
    public static void rodarTestLinkedTest() {
        Node<Integer> newNode = new Node(2);

        LinkedQueue<Integer> queue = new LinkedQueue<>(newNode);

        System.out.println("\n\nRodando Linked Queue\n");

        System.out.println("Primeiro:" + queue.peek());

        System.out.println("Tamanho antes do Push: " + queue.size());

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);

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
