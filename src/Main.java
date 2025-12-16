public class Main{
    public static void main(String[] args){
        PatientList list=new PatientList();
        //Task 1
        list.addPatient(new Patient(1, "Mia",   7, 30));
        list.addPatient(new Patient(2, "Amanda",     5, 40));
        list.addPatient(new Patient(3, "Lena", 9, 50));
        list.addPatient(new Patient(4, "Nicole",   3, 25));
        list.addPatient(new Patient(5, "Emily",   8, 60));
        System.out.println("Removing patient with ID 2");
        list.removePatient(2);
        System.out.println("Searching for patient with ID 3");
        Patient found = list.findPatient(3);
        if (found !=null) {
            System.out.println("Found patient: " +found);
        } else {
            System.out.println("ID 3 is not found");

        }
        list.printList();
        System.out.println();
        System.out.println();
        System.out.println();

        //Task 2
        TreatmentQueue queue = new TreatmentQueue();
        queue.enqueue(new TreatmentRequest(1));
        queue.enqueue(new TreatmentRequest(2));
        queue.enqueue(new TreatmentRequest(3));
        queue.enqueue(new TreatmentRequest(4));
        queue.enqueue(new TreatmentRequest(5));
        queue.enqueue(new TreatmentRequest(6));
        queue.enqueue(new TreatmentRequest(7));
        queue.enqueue(new TreatmentRequest(8));
        System.out.println("The first version of queue:");
        queue.printQueue();
        //printing the dequeued treatment requests
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Remaining queue:");     //printing the remaining queue
        queue.printQueue();
        System.out.println();
        System.out.println();
        System.out.println();
        //Task 3
        DischargeStack stack=new DischargeStack();
        stack.push(new DischargeRecord(100));
        stack.push(new DischargeRecord(200));
        stack.push(new DischargeRecord(300));
        stack.push(new DischargeRecord(400));
        stack.push(new DischargeRecord(500));
        System.out.println("The first version of stack:");
        stack.printStack();
        //popping some elements
        System.out.println("Popped:"+stack.pop());
        System.out.println("Popped:"+stack.pop());

        System.out.println("Remaining stack:");     //printing the remaining stack
        stack.printStack();


    }

}