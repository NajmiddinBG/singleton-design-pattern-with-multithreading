package uz.friday;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 500; i++) {
//            executorService.execute(() -> System.out.println(System.identityHashCode(NotSingletonService.getInstance())));
            executorService.execute(() -> System.out.println(System.identityHashCode(Service.getInstance())));
        }
        System.out.println("Hello world!");
    }
}