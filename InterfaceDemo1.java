interface PaymentMethod {
    void makePayment();
}

class PhonePe implements PaymentMethod {
    public void makePayment() {
        System.out.println("Payment made using PhonePe");
    }
}

class GooglePay implements PaymentMethod {
    public void makePayment() {
        System.out.println("Payment made using Google Pay");
    }
}

class Paytm implements PaymentMethod {
    public void makePayment() {
        System.out.println("Payment made using Paytm");
    }
}

public class InterfaceDemo1 {
    public static void main(String[] args) {

        PhonePe p1 = new PhonePe();
        GooglePay p2 = new GooglePay();
        Paytm p3 = new Paytm();

        p1.makePayment();
        p2.makePayment();
        p3.makePayment();
    }
}