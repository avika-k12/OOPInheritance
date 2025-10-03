public class Main {
    public static void main(String[] args){
        Student avika = new Student("Avika", 16, 20012009);

        System.out.println(avika.introduceSelf());
        System.out.println(avika.displayInfo());

        System.out.println();

        Employee ben = new Employee("Ben", 22, 11842903, 5.5f);

        System.out.println(ben.introduceSelf());
        System.out.println(ben.displayInfo());
        System.out.println(ben.hoursWorked(6.5f));
    }
}
