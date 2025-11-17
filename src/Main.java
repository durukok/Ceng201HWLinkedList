public class Main{
    public static void main(String[] args){
        PatientList list=new PatientList();
        list.addPatient(new Patient(1, "Mia",   7, 30));
        list.addPatient(new Patient(2, "Amanda",     5, 40));
        list.addPatient(new Patient(3, "Emma", 9, 50));
        list.addPatient(new Patient(4, "Nicole",   3, 25));
        list.addPatient(new Patient(5, "Emily",   8, 60));
        System.out.println("Removing patient with ID 2");
        list.removePatient(2);
        System.out.println("Searching for patient with ID 3");
        Patient p = list.findPatient(3);
        if (p != null)
            System.out.println("Found: " + p);
        else
            System.out.println("Patient not found!");
        list.printList();
    }

}