package Java;

class uberBlack extends Car {

    String brand;
    String model;

    public uberBlack(String license, Account driver, String brand, String model) {
        super(license, driver);
        //parametros desde clase Car lamando su metodo constructor

        this.brand = brand;
        this.model = model;

    }
    
}