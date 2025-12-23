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
        TreatmentQueue q = new TreatmentQueue();
        q.enqueue(new TreatmentRequest(1));
        q.enqueue(new TreatmentRequest(2));
        q.enqueue(new TreatmentRequest(3));
        q.enqueue(new TreatmentRequest(4));
        q.enqueue(new TreatmentRequest(5));
        q.enqueue(new TreatmentRequest(6));
        q.enqueue(new TreatmentRequest(7));
        q.enqueue(new TreatmentRequest(8));
        System.out.println("The first version of queue:");
        q.printQueue();
        //printing the dequeued treatment requests
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        System.out.println("Remaining queue:");     //printing the remaining queue
        q.printQueue();
        System.out.println();
        System.out.println();
        System.out.println();
        //Task 3
        DischargeStack s=new DischargeStack();
        s.push(new DischargeRecord(100));
        s.push(new DischargeRecord(200));
        s.push(new DischargeRecord(300));
        s.push(new DischargeRecord(400));
        s.push(new DischargeRecord(500));
        System.out.println("The first version of stack:");
        s.printStack();
        //popping some elements
        System.out.println("Popped:"+s.pop());
        System.out.println("Popped:"+s.pop());

        System.out.println("Remaining stack:");     //printing the remaining stack
        s.printStack();


    }

}