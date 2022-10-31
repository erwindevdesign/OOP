package Java;

public class Car {
    /* atribbutos */
    Integer id;
    String license;
    Account driver;
    Integer passegenger;


    /* Metodo constructor */
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        
    }

    /* metodo printCard */
    void printDataCar() {
        System.out.println("License: " + license + "Name Driver: " + driver.name);
    }
}
