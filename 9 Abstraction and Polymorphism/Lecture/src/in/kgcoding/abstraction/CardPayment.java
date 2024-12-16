package in.kgcoding.abstraction;

class CardPayment implements Payment {

    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PaypalPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
