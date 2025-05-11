package org.example.virtualthreads;

public class ReserveController {
    private ReserveService reserveService = new ReserveService();
    public void execute(Resource resource) {
        reserveService.execute(resource);
    }
}
