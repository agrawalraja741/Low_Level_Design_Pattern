package Singleton;

public class Client {

    public static void main(String[] args) {
        SingletonDemo singleton = SingletonDemo.getInstance();
        SingletonDemo singleton1 = SingletonDemo.getInstance();

        if(singleton == singleton1){
            System.out.println("singleton is the same");
        }
        else{
            System.out.println("singleton is not the same");
        }
    }



}
