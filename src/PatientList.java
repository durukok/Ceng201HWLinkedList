public class PatientList {
    PatientNode head;

    public PatientList() {       //Constructor
        this.head=null;
    }

    public void addPatient(Patient p) {
        PatientNode a=new PatientNode(p);
        if (head==null) {         //if list empty
            head=a;
            return;
        }
        PatientNode current=head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next=a;
    }


    public void removePatient(int id) {
        if (head==null) {         //if list is empty
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
    public void findPatient(int id) {
        if (head==null) {
            System.out.println("Empty List");
        }else{
            PatientNode current=head;
            while (current!=null) {
                if (current.data.getId()==id) {
                    System.out.println("Found patient: "+current.data);
                    current=null;
                } else if (current.next==null) {
                    System.out.println("ID: "+id+" not found");
                    current=null;
                } else {
                    current=current.next;
                }
            }
        }
    }
    public void printList(){
        if (head==null) {
            System.out.println("Empty List");
        }else{
            PatientNode current=head;
            while (current!=null) {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
}