package Prototype_Registry.Prototype;

public class IntellegentStudent extends Student {

    private String StudentType;

    public IntellegentStudent(String name, int age, String studentType) {
        super(name, age);
        StudentType = studentType;
    }

    public String getStudentType() {
        return StudentType;
    }

    public void setStudentType(String studentType) {
        StudentType = studentType;
    }

    @Override
    public String toString() {
        return "IntellegentStudent{" +
                super.toString() +
                "StudentType='" + StudentType + '\'' +
                '}';
    }

    public IntellegentStudent copy(IntellegentStudent intellegentStudent )
    {
        return new IntellegentStudent(intellegentStudent.getName(), intellegentStudent.getAge(), intellegentStudent.getStudentType());
    }

}
