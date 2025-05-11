package org.example.virtualthreads;

import java.time.Duration;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        var reserveController = new ReserveController();
        var resource = createResource();

       IntStream.range(0, 10).forEach(i -> reserveController.execute(resource));

        var end = System.currentTimeMillis();

        System.out.println("Duração: " + Duration.ofMillis(end - start).toSeconds());
    }

    private static Resource createResource() {
        var address = new Address();
        address.setNumber("123");
        address.setStreetName("Rua teste");

        var resource = new Resource(null);
        resource.setAddress(address);
        return resource;
    }
}