
public class Main {

    
    public static void main(String[] args) {
   
        Car defaultCar = new Car();
       // defaultCar.printAtributs();
        
        
        Car audi = new Car("audi A4", "BG-1234");
        audi.printAtributs();
        
        audi.setWeight(1400);
        audi.setConsumption(10);
        //audi.printAtributs();
        
       Car bmw = new Car("bmw", 200, 1300, "BG-5678", 0, 0,100, 15);
       bmw.fuelUp();
       bmw.printAtributs();
       
       bmw.travel(4);
       bmw.printAtributs();
       
       bmw.travel(6);
       bmw.printAtributs();
    }
    
    
}
