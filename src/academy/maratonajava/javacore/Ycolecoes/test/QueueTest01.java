package academy.maratonajava.javacore.Ycolecoes.test;

import academy.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Willian Suane");
        Queue<Consumidor> consumidorQueue = new PriorityQueue<>();
        consumidorQueue.add(consumidor);

    }
}
