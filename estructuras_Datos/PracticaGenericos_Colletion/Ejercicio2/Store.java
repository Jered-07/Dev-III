package estructuras_Datos.PracticaGenericos_Colletion.Ejercicio2;

public interface Store <T> {
    public void add(T value);
    public T get(int index);
    public int quantity();
}
