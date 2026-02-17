package Jan03;

public class Main {
    public String name;
    public static void main(String[] args) {
         int x = 10;

//         Employee employee = new Employee("tom");
//        System.out.println(employee.name);

        int[] arr = {1,2,3,4};

//        String bank = "Scotia";
//        String institute = "Scotia";
//        String bla = "scotia";
//        String bro = " Scotia ";
//        System.out.println(bank.equalsIgnoreCase(bla));
//        System.out.println(bank.equals(bla));
//        System.out.println(bro.trim());
//        System.out.println(bro);


//        System.out.println(bank == institute);
//        System.out.println(bank.equals(institute));
//        String employee = new String("Harry");
//        String student = new String("Harry");
//
//        System.out.println(employee.equals(student));
//        System.out.println(employee == student);


        Employee employee = new Employee("Harry", "1243");
//        System.out.println(employee);
//        employee.talk();
//        employee.work();
//        employee.withDrawSalary();

        Manager manager = new Manager();
        manager.name = "bro";
        manager.id = "1233";

//        System.out.println(manager);

//       manager.talk();
//       manager.work();
//       manager.withDrawSalary();

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);
        Car car = new Car();
        car.license_no = "12433";
        car.name = "bmw";
        System.out.println(car);

    }
}
