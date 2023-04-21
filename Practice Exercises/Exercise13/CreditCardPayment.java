import Exercise13.payment;

public class CreditCardPayment extends payment
{
    private string NameOnCard;
    private string expirationDate;
    private string creditCardNumber;

    public CreditCardPayment(string NameOnCardInput, string expirationDateInput, string creditCardNumberInput)
    {
        this.NameOnCard = NameOnCardInput;
        this.expirationDate = expirationDateInput;
        this.creditCardNumber = creditCardNumberInput;
    }

    public void paymentDetails(double amountOfPaymentToOutput, CreditCardPayment inputCard)
    {
        System.out.println("The credit card payment amount is: "+ amountOfPaymentToOutput);
        System.out.println("The name on the card is: "+ inputCard.NameOnCard);
        System.out.println("The expiration date on the card is: "+ inputCard.expirationDate);
        System.out.println("The credit card number on the card is: "+ inputCard.creditCardNumber);
    }
}
