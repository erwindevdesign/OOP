package Java;

class Main {

    public static void main(String[] args) {
        System.out.println( "Hello Bitch!");
        Car car = new Car("AMQ123", new Account("Miguel Lopéz", "AMQ123"));
        car.passegenger = 3;
        car.printDataCar();

        Car car2 = new Car("WET123", new Account("Sandra Lucid Flow", "WET123"));
        car2.passegenger = 3;
        car2.printDataCar();


    }


}
/* 
 * 
 * 
 * 
 * 
 */

/* System.out.println("Car License: " + car2.license); */