package Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

class uberVan extends Car {
    Map<String, ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;


    public uberVan(String license, Account driver, 
    Map<String, ArrayList<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial ) {
        super(license, driver);
        //parametros desde clase Car lamando su metodo constructor
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    
}