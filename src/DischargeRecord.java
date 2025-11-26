public class DischargeRecord {
    public int patientId;
    public long dischargeTime;
    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
    public String toString() {
        return "DischargeRecord{patientId=" + patientId +
                ", dischargeTime=" + dischargeTime + "}";
    }
}



