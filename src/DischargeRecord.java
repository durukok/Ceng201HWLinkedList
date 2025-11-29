public class DischargeRecord {
    public int patientId;
    public long dischargeTime;
    public DischargeRecord(int patientId) {     //constructor
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
    public String toString() {         //readable string
        return "DischargeRecord{patientId=" + patientId +
                ", dischargeTime=" + dischargeTime + "}";
    }
}



