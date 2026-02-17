package Jan06;

public class PaymentMain {
    public static void main(String[] args) {


        Payment payment = new Payment();
        payment.payment();

        Debit debit = new Debit();
        debit.payment();

        Credit credit = new Credit();
        credit.payment();

    }
}
