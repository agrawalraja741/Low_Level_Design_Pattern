package Prototype_Registry.Prototype;

public class Client {

    public static void main(String[] args) {

        IntellegentStudent intellegentStudent = new IntellegentStudent("XYZ",22, "Intellegent Student");

        System.out.println(intellegentStudent);
        IntellegentStudent intellegentStudent1 = intellegentStudent.copy(intellegentStudent);
        System.out.println(intellegentStudent1);

        if (intellegentStudent.equals(intellegentStudent1)) {
            System.out.println("Same");
        }
        else {
            System.out.println("Copy");
        }

    }
}
