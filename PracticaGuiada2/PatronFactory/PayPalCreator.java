package PracticaGuiada2.PatronFactory;

public class PayPalCreator extends Creator{

    @Override
    public ProcessPayment createProcessPayment(int amount) {
        return new PayPal(amount);
    }
    
}
