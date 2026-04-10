package Ejemplo_Buider;

public class Main {
    public static void main(String[] args) {

        BurgerClassic classic = new BurgerClassic();
        Chef chef = new Chef(classic);
        chef.burgerClassic();
        System.out.println("Hamburguesa Clasica");
        Hamburger h1 = classic.resul();
        System.out.println(h1.toString());


        System.out.println("------------");

        VeganBurger vegan = new VeganBurger();
        chef.setBuilder(vegan);
        chef.burgerVegan();
        Hamburger h2 = vegan.resul();
        System.out.println("Hamburguesa Vegana");
        System.out.println(h2.toString());
    

    }
}
