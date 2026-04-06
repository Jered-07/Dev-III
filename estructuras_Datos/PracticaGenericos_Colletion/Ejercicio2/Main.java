package estructuras_Datos.PracticaGenericos_Colletion.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Store<Electronic> electronicStore = new FullingStore<>();
        electronicStore.add(new Electronic("Monitor", "Asus", 50000));
        electronicStore.add(new Electronic("Celular", "Samsung", 102000));
        System.out.println(electronicStore.get(0) + "\n Cantidad de productos en el almacen: " + electronicStore.quantity());

        Store<Food> foodStore = new FullingStore<>();
        foodStore.add(new Food("Pollo", "5/6/2026", 3));
        foodStore.add(new Food("Atún", "20/8/2030", 20));
        System.out.println(foodStore.get(0) + "\n Cantidad de productos en el almacen: " + foodStore.quantity());


    }
}