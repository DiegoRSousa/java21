package org.example.virtualthreads;

public class ReserveService {
    public void execute(Resource resource) {
        System.out.println(Thread.currentThread() + " Reservando recurso: " + resource.toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Reserva realizada!");
    }
}
