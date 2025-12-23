public class TreatmentRequest {
    int patientId;
    long arrivalTime;

    public TreatmentRequest(int patientId) {       //construcor
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
    }
    //readable string
    public String toString() {
        return "Patient ID: " + patientId + " (arrivalTime: " + arrivalTime + ")";
    }
}


