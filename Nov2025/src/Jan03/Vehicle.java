package Jan03;

public class Vehicle {

    String name;
    String license_no;

    void condition(){
        System.out.println("Good condition");
    }

    void lincense(){
        System.out.println("License");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", license_no='" + license_no + '\'' +
                '}';
    }
}
