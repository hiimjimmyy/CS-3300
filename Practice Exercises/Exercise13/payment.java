package Exercise13;

public class payment 
{
    private double amountOfPayment;

    public void paymentDetails(double amountOfPaymentToOutput)
    {
        System.out.println("The credit card payment amount is: "+ getAmountOfPayment());
    }

    public double getAmountOfPayment() {
        return this.amountOfPayment;
    }

    public void setAmountOfPayment(double amountOfPayment) {
        this.amountOfPayment = amountOfPayment;
    }
}

// public class cashPayment extends payment
// {
//     public void testing()
//     {
//         System.out.println("hello world testing");
//     }
// }

