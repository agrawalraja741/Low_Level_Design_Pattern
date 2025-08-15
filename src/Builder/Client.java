package Builder;

public class Client {

    public static void main(String[] args) {

            Student student = Student.getBuilder()
                    .setName("XYZ")
                    .setAge(25)
                    .setGender("Male")
                    .setPsp(100)
                    .build();

            System.out.println(student);
    }
}
