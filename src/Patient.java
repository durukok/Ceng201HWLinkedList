public class Patient {
    private int id;
    private String name;
    private int severity;
    private int age;
    public Patient() {  //parameterless constructır
        this(0, "", 0, 0);
    }
    public Patient(int id, String name, int severity, int age) {   // Parameterized constructor
        this.id=id;
        this.name=name;
        this.severity=severity;
        this.age=age;
    }
    //Getter and setter methods
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id =id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getSeverity(){
        return this.severity;
    }
    public void setSeverity(int severity){
        this.severity=severity;
    }public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age= age;
    }
    public String toString() {
        return id + " - " + name + " (" + age + ", severity " + severity + ")";
    }
}
