package org.example.virtualthreads;

public class ReserveController {
    private ReserveService reserveService = new ReserveService();
    public Runnable execute(Resource resource) {
        return () -> reserveService.execute(resource);
    }
}
