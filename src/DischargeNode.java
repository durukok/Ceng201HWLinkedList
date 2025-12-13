public class DischargeNode {
    DischargeRecord data;        //object
    DischargeNode next;         //pointer to the next node

    DischargeNode(DischargeRecord data) {//constrcuctor
        this.data=data;
        this.next=null;
    }
}
