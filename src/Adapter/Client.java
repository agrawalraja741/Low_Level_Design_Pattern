package Adapter;

public class Client {

    public static void main(String[] args) {

        PhonePayAPI phonePayAPI = new PhonePayAPI();
        System.out.println(phonePayAPI.getBalance(12345));

    }
}
