package org.example.virtualthreads;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        var reserveController = new ReserveController();
        var resource = new Resource(new Address("Rua Teste", "123"));

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10).forEach(i -> {
                var runnable = reserveController.execute(resource);
                executor.submit(runnable);
            });
        }

        var end = System.currentTimeMillis();

        System.out.println("Duração: " + Duration.ofMillis(end - start).toSeconds());
    }
}