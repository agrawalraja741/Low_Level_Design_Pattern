package Flyweight;

public class Client {

    public static void main(String[] args) {

        Bullet bullet = new Bullet("Black", 100);
        FinalBullet finalBullet = new FinalBullet(bullet, 50);
        System.out.println(finalBullet);
        FinalBullet finalBullet1 = new FinalBullet(bullet, 55);
        System.out.println(finalBullet1);

        //using same bullet obj to create final bullet object which is going to save a lot of space
    }
}
