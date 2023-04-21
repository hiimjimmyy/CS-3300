import Exercise13.payment;

public class exercise13Driver 
{
    public static void main(String[] args)
    {
        cashPayment cashPaymentObj = new cashPayment();
        cashPayment cashPaymentObj2 = new cashPayment();


        System.out.println("cash payment 1");
        cashPaymentObj.setAmountOfPayment(12.34);
        cashPaymentObj.paymentDetails();
        System.out.println("cash payment 2");
        cashPaymentObj2.setAmountOfPayment(12.34);
        cashPaymentObj2.paymentDetails();


        // CreditCardPayment CreditCardPaymentObj1 = new CreditCardPayment("Fred", "10/20/2024", "123456789012");
        // System.out.println("credit card payment 1:");
        // CreditCardPaymentObj1.paymentDetails(25.26, CreditCardPaymentObj1);





        System.out.println("credit card payment 2:");

    }
}
