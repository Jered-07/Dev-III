package estructuras_Datos;

import java.util.HashMap;

public class Map_Practice {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rafa", 537);
        map.put("Jered", 872);
        map.put("Diego", 872);
        

        System.out.println(map);
        System.out.println(map.putIfAbsent("Pablo", 357));
        System.out.println(map);

    }
    
}
