public class TreatmentRequestNode {
    TreatmentRequest data;      //object
    TreatmentRequestNode next;        //pointer
    TreatmentRequestNode(TreatmentRequest data) {           //constructor
        this.data=data;
        this.next=null;
    }
}

