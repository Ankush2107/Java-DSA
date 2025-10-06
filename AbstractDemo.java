abstract class Phone {
    abstract void on();
}
class AbstractDemo extends Phone {
    public void on() {
        System.out.println("Turning on...!!!");
    }
    public static void main(String[] args) {
        AbstractDemo ad = new AbstractDemo();
        ad.on();
    }
}
