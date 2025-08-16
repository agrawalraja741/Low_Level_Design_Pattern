package Prototype_Registry.Registry;

import Prototype_Registry.Prototype.IntellegentStudent;
import Prototype_Registry.Prototype.Student;

public class Client {
    public static void main(String[] args) {

        //register students
        Student student = new Student("ABC", 25);
        IntellegentStudent intellegentStudent = new IntellegentStudent("XYZ",22, "Intellegent Student");

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.registerStudent("Student", student);
        studentRegistry.registerStudent("Intellegent Student", intellegentStudent);

        // Fetch from registery

        Student student2 = studentRegistry.getStudent("Student");

        if(student == student2)
        {
            System.out.println("Student is the same");
        }
        else
        {
            System.out.println("We got the copy of student");
        }
    }

}
