

public class EngineCar extends Car{
    EngineCar(String name){
        super(name);
    }
    @Override
    void carType(){
        System.out.println("This is Engine car");
    }
}
