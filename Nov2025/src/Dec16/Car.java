package Dec16;

public class Car {

    int numofCylinder;

    int color;

    int model;

    Car(){

    }

    public Car(int numofCylinder, int color, int model) {
        this.numofCylinder = numofCylinder;
        this.color = color;
        this.model = model;
    }
    //    Car(int color, int model, int numofCylinders){
//        this.color = color;
//        this.model = model;
//        this.numofCylinder = numofCylinders;
//    }

    public void start(){
        System.out.println("car started");
    }
    public int numOfWheels(int wheels){
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numofCylinder=" + numofCylinder +
                ", color=" + color +
                ", model=" + model +
                '}';
    }
}
