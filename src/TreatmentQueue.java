public class TreatmentQueue {
    TreatmentRequestNode front;  // head
    TreatmentRequestNode rear;   // tail
    int count;         //size
    //constructor
    public TreatmentQueue() {
        front=null;
        rear=null;
        count=0;
    }
    // enqueue  is adding element to the end of the queue
    public void enqueue(TreatmentRequest request) {
        TreatmentRequestNode a=new TreatmentRequestNode(request);

        if (rear==null) {  // the queue is empty
            front=a;
            rear=a;
        } else {
            rear.next=a;
            rear=a;
        }

        count++;
    }
    //dequeue is removing the  element from the beginning  of the queue
    public TreatmentRequest dequeue() {
        if (front==null) {           //checkig the queue is empty
            System.out.println("Empty queue");
            return null;
        }
        TreatmentRequest removed=front.data;
        front=front.next;
        if (front==null) {
            rear=null; // empty queue
        }
        count--;
        return removed;
    }
    //size returns the number of requests
    public int size() {
        return count;
    }
    //printQueue prints all requests
    public void printQueue() {
        if (front==null) {
            System.out.println("Queue is empty.");
            return;
        }
        TreatmentRequestNode current=front;
        System.out.println("Treatment Queue:");

        while (current!=null) {  //traversing the list
            System.out.println(current.data);
            current=current.next;
        }
    }

}