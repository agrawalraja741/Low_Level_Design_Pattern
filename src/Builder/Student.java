package Builder;

public class Student {

    private String name;
    private int age;
    private String gender;
    private int psp;

    private Student (StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.gender = studentBuilder.gender;
        this.psp = studentBuilder.psp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    static StudentBuilder  getBuilder()
    {
        return new StudentBuilder();
    }

    static class StudentBuilder{
        private String name;
        private int age;
        private String gender;
        private int psp;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            //validations if needed
            return  new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", psp=" + psp +
                '}';
    }
}
