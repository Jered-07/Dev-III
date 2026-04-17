package PracticaGuiada3.Adapter;

public class Main {
    public static void main(String[] args) { 
        Adapter adapter = new Adapter(new Foreign());
        adapter.conextion();
    }
}
