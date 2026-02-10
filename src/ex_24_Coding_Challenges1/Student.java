package ex_24_Coding_Challenges1;

public class Student {
    String name;
    int rollNo;
    String section;
    //add a method to print student details
    //input Create student with name="Bob", rollNo=101, section="A"
    //output Student: Bob, Roll No: 101, Section: A

    Student(String name, int rollNo, String section)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.section=section;
    }
    void display()
    {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }
}

class StudentInformation
{
    public static void main(String[] args) {
        Student st= new Student("Bob",101,"A");
        st.display();
    }
}
