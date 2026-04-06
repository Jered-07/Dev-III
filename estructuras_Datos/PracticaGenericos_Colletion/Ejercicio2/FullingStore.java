package estructuras_Datos.PracticaGenericos_Colletion.Ejercicio2;

import java.util.ArrayList;

public class FullingStore<T> implements Store<T>{

    private ArrayList<T> list;
    
    public FullingStore (){
        list = new ArrayList<>();
    }

    @Override
    public void add(T value) {
        list.add(value);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public int quantity() {
        return list.size();
    }
    
}
