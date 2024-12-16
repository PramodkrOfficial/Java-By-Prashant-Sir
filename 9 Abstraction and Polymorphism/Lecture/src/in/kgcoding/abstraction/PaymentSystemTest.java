package in.kgcoding.abstraction;

public class PaymentSystemTest {
    public static void main(String[] args) {
        Payment payment1 = new CardPayment();
        Payment payment2 = new PaypalPayment();

        payment1.makePayment(150.00);
        payment2.makePayment(200.00);
    }
}
