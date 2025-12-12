public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    public TreatmentRequest(int patientId) {        //constructor
        this.patientId=patientId;
        this.arrivalTime=0;
    }
    public String toString() {      //readable string
        return "Request{patientId="+patientId+", arrivalTime="+arrivalTime+"}";
    }
}
