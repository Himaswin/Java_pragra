package Dec13;

public class Student {
    String firstName;

    String lastName;

    int rollNo;

    public void displayDetails(){
        System.out.println("My name is " + firstName+ " "+ lastName + "and roll num is "+ rollNo);
    }

    public void display(String fName, String lName){
        System.out.println("My name is " + fName + " " + lName);
    }
}
