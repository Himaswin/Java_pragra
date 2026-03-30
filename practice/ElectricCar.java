

public class ElectricCar extends Car {
    ElectricCar(String name) {
        super(name);
    }

    @Override
     void carType(){
        System.out.println("This is electric car");
    }
}
