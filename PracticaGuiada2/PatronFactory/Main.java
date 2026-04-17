package PracticaGuiada2.PatronFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int amount;
        CreditCardCreator creditCard = new CreditCardCreator();
        PayPalCreator paypal = new PayPalCreator();

        System.out.println("Escoja un metodo de pago" 
        + "\n1. Tarjeta de Credito" 
        + "\n2. PayPal");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el monto del pago");
                amount = sc.nextInt();

                creditCard.createProcessPayment(amount).pay();
            break;


        case 2:
            System.out.println("Ingrese el monto del pago");
            amount = sc.nextInt();

            paypal.createProcessPayment(amount).pay();
        break;
        }
        
        sc.close();

       
    }
}
