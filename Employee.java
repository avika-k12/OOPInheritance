public class Employee extends Person{
    public int workID;
    public float hoursWorked;

    public Employee(String name, int age, int workID, float hoursWorked){
        super(name, age);
        this.workID = workID;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String introduceSelf(){
        System.out.println(super.introduceSelf());
        return "They are an employee";
    }

    @Override
    public String displayInfo(){
        System.out.println(super.displayInfo());
        return "Their employee ID is " + this.workID;
    }

    public String hoursWorked(float hours){
        this.hoursWorked = hours;
        return "They have worked " + this.hoursWorked + " hours this week.";
    }
}
