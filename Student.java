public class Student extends Person{
    public int StudentID;

    public Student(String name, int age, int studentID){
        super(name, age);
        this.StudentID = studentID;
    }

    @Override
    public String introduceSelf(){
        System.out.println(super.introduceSelf());
        return "They are a student";
    }

    @Override
    public String displayInfo(){
        System.out.println(super.displayInfo());
        return "Their student ID is " + this.StudentID;
    }
}
