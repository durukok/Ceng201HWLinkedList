public class TreatmentRequest {
    public int patientId;
    public long arrivalTime;
    public boolean priority;

    public TreatmentRequest(int patientId,boolean priority) {       //construcor
        this.patientId = patientId;
        this.priority = priority;
        this.arrivalTime = System.currentTimeMillis();
    }
    //readable string
    public String toString() {
        return "Patient ID: " + patientId +" (priority: " + priority +", arrivalTime: " + arrivalTime + ")";
    }
}


