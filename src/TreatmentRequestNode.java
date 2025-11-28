public class TreatmentRequestNode {
    TreatmentRequest data;      //object
    TreatmentRequestNode next;        //pointer to the next node
    TreatmentRequestNode(TreatmentRequest data) {           //constructor
        this.data = data;
        this.next = null;
    }
}

