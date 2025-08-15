package Flyweight;

public class FinalBullet {

    Bullet bullet;
    int damage;

    public FinalBullet(Bullet bullet, int damage) {
        this.bullet = bullet;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "BulletVal{" +
                "bullet=" + bullet +
                ", damage=" + damage +
                '}';
    }
}
