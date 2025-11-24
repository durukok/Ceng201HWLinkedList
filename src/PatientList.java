public class PatientList {
    PatientNode head;
    public PatientList(){       //Constructor
        this.head=null;

    }
    //adding the patient
    public void addPatient(Patient p){
        PatientNode newNode=new PatientNode(p);
        if(head==null){         //if list empty
            head=newNode;
            return;
        }
        //append at the end
        PatientNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    //removing the patient
    public void removePatient(int id){
        if (head == null) {         //if list is empty
            System.out.println("Empty List");
            return;
        }
        if (head.data.getId() == id) {   // If the patient to be deleted is at the beginning of the list
            head = head.next;
            System.out.println("ID: " + id + " removed");
            return;
        }
        PatientNode current = head;       //Look in between: Proceed by checking current.next
        while (current.next != null && current.next.data.getId() != id) {
            current = current.next;
        }
        if (current.next == null) {      // If not found
            System.out.println("ID: " + id + " not found");
            return;
        }
        current.next = current.next.next;
        System.out.println("ID: " + id + " removed");
    }
    //finding the patient
    public Patient findPatient(int id) {
        PatientNode current = head;
        while (current != null) {
            if (current.data.getId() == id) {
                return current.data;  // found
            }
            current = current.next;
        }
        return null;
    }
    //printing the list
    public void printList() {
        if (head == null) {     //checking the list is empty or not
            System.out.println("Empty List");
            return;
        }
        PatientNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
