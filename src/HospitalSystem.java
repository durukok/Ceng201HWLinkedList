import java.util.*;

public class HospitalSystem {

    private  PatientList patientList;
    private  PriorityTreatmentQueue treatmentQueue;
    private  DischargeStack dischargeStack;
    private  HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {  //contructor
        patientList= new PatientList();
        treatmentQueue = new PriorityTreatmentQueue();
        dischargeStack= new DischargeStack();
        patientMap =new HashMap<>();
    }

    // adds patient if not already registered
    public void addPatient(Patient p) {
        if (patientMap.containsKey(p.id)) {
            System.out.println("Patient already exists");
        } else {
            patientList.addPatient(p);
            patientMap.put(p.id, p);
        }
    }

    // Adding treatment request
    public void addTreatmentRequest(TreatmentRequest r) {
        treatmentQueue.enqueue(r);
    }

    // Adding  discharge record
    public void addDischarge(int patientId) {
        dischargeStack.push(new DischargeRecord(patientId));
    }

    // Process treatment
    public void processTreatment() {
        TreatmentRequest r = treatmentQueue.dequeue();
        if (r==null) {
            return;
        }
        DischargeRecord record= new DischargeRecord(r.patientId);
        dischargeStack.push(record);
        }



     // simple bubble sort, array size is small
    public void sortPatientsBySeverity(Patient[] arr) {
        for (int i= 0; i< arr.length; i++) {
            for (int j= 0; j < arr.length-1; j++) {
                if (arr[j].severity < arr[j+1].severity) {
                    Patient temp= arr[j];
                    arr[j]= arr[j + 1];
                    arr[j+1]= temp;
                }
            }
        }

    }

    // Printing  data
    public void printAll() {
        System.out.println("Patients:  ");
        patientList.printList();

        System.out.println("Treatment Queues: ");
        treatmentQueue.printQueue();

        System.out.println("Discharge Stack:  ");
        dischargeStack.printStack();
    }
}




