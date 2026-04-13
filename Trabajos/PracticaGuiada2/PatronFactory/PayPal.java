package PracticaGuiada2.PatronFactory;

public class PayPal implements ProcessPayment {

    private int amount;


    public PayPal(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
      System.out.println("El pago de " + amount + " colones " +  " se completo mediante Paypal");
    }
    
}
