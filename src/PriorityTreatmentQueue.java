public class PriorityTreatmentQueue {
    private TreatmentQueue priorityQueue;
    private TreatmentQueue normalQueue;

    public PriorityTreatmentQueue() {
        priorityQueue = new TreatmentQueue();
        normalQueue = new TreatmentQueue();
    }

    // Add request to correct queue
    public void enqueue(TreatmentRequest request) {
        if (request.priority) {
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);
        }
    }

    // Always serve priority queue first
    public TreatmentRequest dequeue() {
        if (priorityQueue.size() > 0) {
            return priorityQueue.dequeue();
        } else {
            return normalQueue.dequeue();
        }
    }

    public void printQueue() {
        System.out.println("Priority Requests:");
        priorityQueue.printQueue();

        System.out.println("Normal Requests:");
        normalQueue.printQueue();
    }
}

