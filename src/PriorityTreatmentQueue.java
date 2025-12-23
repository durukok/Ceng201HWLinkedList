public class PriorityTreatmentQueue {
    private  TreatmentQueue priorityQueue;
    private  TreatmentQueue normalQueue;
    private int totalRequests;

    public PriorityTreatmentQueue() {
        this.priorityQueue = new TreatmentQueue();
        this.normalQueue = new TreatmentQueue();
        this.totalRequests = 0;
    }

    // Adding  request
    public void enqueue(TreatmentRequest request) {
        totalRequests++;
        if (request.priority==true) {
            priorityQueue.enqueue(request);
            return;

        }
        normalQueue.enqueue(request);

    }


    //removing request
    public TreatmentRequest dequeue() {
        TreatmentRequest r;
        if (priorityQueue.size() > 0) {
            r=priorityQueue.dequeue();
        } else {

            r= normalQueue.dequeue();
        }
        return r;

    }


    //printing queues
    public void printQueue() {
        System.out.println("Priority Requests:");
        priorityQueue.printQueue();

        System.out.println("Normal Requests:");
        normalQueue.printQueue();
    }

}

