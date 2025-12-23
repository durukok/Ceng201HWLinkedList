import java.util.HashMap;

public class HospitalSystem {

    private PatientList patientList;
    private PriorityTreatmentQueue treatmentQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        patientList = new PatientList();
        treatmentQueue = new PriorityTreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }

    // Add new patient
    public void addPatient(Patient p) {
        patientList.addPatient(p);
        patientMap.put(p.id, p);
    }

    // Add treatment request
    public void addTreatmentRequest(TreatmentRequest r) {
        treatmentQueue.enqueue(r);
    }

    // Add discharge record
    public void addDischarge(int patientId) {
        dischargeStack.push(new DischargeRecord(patientId));
    }

    // Process treatment
    public void processTreatment() {
        TreatmentRequest r = treatmentQueue.dequeue();
        if (r != null) {
            dischargeStack.push(new DischargeRecord(r.patientId));
        }
    }

    // Bubble Sort patients by severity (HIGH → LOW)
    public void sortPatientsBySeverity(Patient[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].severity < arr[j + 1].severity) {
                    Patient temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Print system state
    public void printSystemState() {
        System.out.println("Patients:");
        patientList.printList();

        System.out.println("Treatment Queues:");
        treatmentQueue.printQueue();

        System.out.println("Discharge Stack:");
        dischargeStack.printStack();
    }
}


