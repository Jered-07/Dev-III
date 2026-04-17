package PracticaGuiada2.PatronFactory;

public class CreditCard implements ProcessPayment{

    private int amount;

    
    public CreditCard(int amount) {
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
        System.out.println("El pago de " + amount + " colones " +  " se completo con tarjeta de credito");
    }
    
}
