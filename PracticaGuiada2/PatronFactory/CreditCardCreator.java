package PracticaGuiada2.PatronFactory;

public class CreditCardCreator extends Creator{

    @Override
    public ProcessPayment createProcessPayment(int amount) {
        return new CreditCard(amount);
    }
    
}
