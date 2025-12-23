public class PatientList {
    PatientNode head;
    //constructor
    public PatientList() {
        this.head=null;
    }
    //adding the patient
    public void addPatient(Patient p) {
        PatientNode a =new PatientNode(p);
        if (head==null) {
            head= a;
            return;
        }
        PatientNode current=head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next= a;
    }
    //removing the patient
    public void removePatient(int id) {
        if (head==null) {
            System.out.println("Empty List");
        } else {
            if (head.data.getId()==id) {
                head=head.next;
                System.out.println("ID: "+id+" removed");
            } else {
                PatientNode current=head;
                while (current.next!=null && current.next.data.getId()!=id) {
                    current=current.next;
                }
                if (current.next==null) {
                    System.out.println("ID: "+id+" not found");
                } else {
                    current.next=current.next.next;
                    System.out.println("ID: "+id+" removed");
                }
            }
        }
    }
    //searching the patient
    public Patient findPatient(int id) {
        PatientNode temp =head;
        while (temp !=null) {
            if (temp.data.getId()== id) {
                return temp.data;
            }
            temp =temp.next;
        }
        return null;
    }
    //printing the list
    public void printList(){
        if (head==null) {
            System.out.println("Empty List");
        }else{
            PatientNode current =head;
            while (current!=null) {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
}