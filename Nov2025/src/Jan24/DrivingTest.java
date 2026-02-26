package Jan24;

public class DrivingTest {



    void checkAge(int age){
        if(age < 16){
            throw new LegalageException("Age is not satisfied");
        }
    }
}
