package Jan24;

public class OnlineWebApp {

    void register() throws InvalidEmailException{
        throw new InvalidEmailException("Invalid email");
    }

    void emailConfirmation() throws InvalidEmailException{
        register();
        System.out.println("email confirmed");
    }

    void login() throws InvalidEmailException{
        emailConfirmation();
        System.out.println("logged in");
    }

    void shop() throws InvalidEmailException{
        login();
        System.out.println("shopping done ");
    }
    void payment() throws InvalidEmailException{
        shop();
        System.out.println("Payment done");
    }
}
