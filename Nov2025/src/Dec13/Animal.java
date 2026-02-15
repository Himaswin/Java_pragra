package Dec13;

public class Animal {
    String name;

    String age;

    String color;

    String type;

    int size;

    double weight;

    public void makeSound(){
        System.out.println("animal is making sound");
    }
    public void eat(){
        System.out.println("animal is eating");
    }

    public String walk(){
        return "animal is walking";
    }

    public int calculateWeight(){
        return 50;
    }
}
