interface Drivable {
    void startEngine();

    void stopEngine();

}

class Car implements Drivable {
    public void startEngine() {

        System.out.println("Car Started!!!");
    }

    public void stopEngine() {
        System.out.println("Car stopped!!!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Drivable myCar = new Car();
        myCar.startEngine();
        myCar.stopEngine();
    }
}
