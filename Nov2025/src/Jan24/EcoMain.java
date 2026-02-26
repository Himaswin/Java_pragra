package Jan24;

public class EcoMain {

    public static void main(String[] args) {
        OnlineWebApp webApp = new OnlineWebApp();

        try {
            webApp.payment();
        }catch (InvalidEmailException e){
            e.printStackTrace();
        }
        System.out.println("end of the code");
        }
}
