//Encapsulation --> Binding data with Methods
class Student
{
    private int rollno;
    private String name;

    // Getters and Setters

    public int getRollno()
    {
        System.out.println("User is accessing the value");
        return rollno;
    }

    public void setRollno(int rollno)
    {
        this.rollno = rollno;
        System.out.println("Value of rollNo changed");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

public class EncapsulationDemo
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setRollno(90);
        s1.setName("Ashina");
        System.out.println(s1.getName());
        System.out.println(s1.getRollno());
    }
}
