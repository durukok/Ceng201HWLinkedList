public class TreatmentQueue {
    TreatmentRequestNode front;  // head
    TreatmentRequestNode rear;   // tail
    int count;         //size

    public TreatmentQueue() {
        front=null;
        rear=null;
        count=0;
    }
    // enqueue  is adding an element to the rear of the queue
    public void enqueue(TreatmentRequest request) {
        TreatmentRequestNode a=new TreatmentRequestNode(request);

        if (rear==null) {  // teh queue is empty
            front=a;
            rear=a;
        } else {
            rear.next=a;
            rear=a;
        }

        count++;
    }
    //dequeue is removing and return the element from the front of the queue
    public TreatmentRequest dequeue() {
        if (front==null) {           //checkig the queue is empty
            System.out.println("Empty queue");
            return null;
        }
        TreatmentRequest removed=front.data;
        front=front.next;  //moving the pointer to the next node
        if (front==null) {
            rear=null; // queue became empty
        }
        count--;
        return removed;
    }
    //size returns the number of requests in the queue
    public int size() {
        return count;
    }
    //printQueue prints all requests in the queue
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