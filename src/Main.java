public class Main{
    public static void main(String[] args){
        PatientList list=new PatientList();
        //Task 1
        list.addPatient(new Patient(1, "Mia",   7, 30));
        list.addPatient(new Patient(2, "Amanda",     5, 40));
        list.addPatient(new Patient(3, "Emma", 9, 50));
        list.addPatient(new Patient(4, "Nicole",   3, 25));
        list.addPatient(new Patient(5, "Emily",   8, 60));
        System.out.println("Removing patient with ID 2");
        list.removePatient(2);
        System.out.println("Searching for patient with ID 3");
        list.findPatient(3);
        list.printList();
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
        //printing the dequeued treatment requests
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Remaining queue:");     //printing the remaining queue
        queue.printQueue();
        //Task 3
    }

}