interface Bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class Sunriser implements Bicycle {
    int speed = 10;
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }
    public void speedUp(int increment) {
        speed = speed + increment;
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Sunriser sr = new Sunriser();
        sr.speedUp(10);
        System.out.println("After speed up " + sr.speed);
        sr.applyBrake(2);
        System.out.println("After applying brake " + sr.speed);
    }    
}
