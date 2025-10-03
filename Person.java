public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String introduceSelf(){
        return "This person is called " + this.name;
    }

    public String displayInfo(){
        return this.name + " is " + this.age + " years old";
    }

}
