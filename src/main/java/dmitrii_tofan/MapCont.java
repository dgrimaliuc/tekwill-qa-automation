package dmitrii_tofan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapCont {
//    1.	Create a Map that stores the abbreviator as keys and String[] with country name and its capital.
//    Add some pairs to the map and retrieve the capital of a specific country.
    public static void main(String[] args) {
        Map<String, String[]> countries = new HashMap<String, String[]>();
        countries.put("MD", new String[]{"Moldova", "Chisinau"});
        countries.put("RO", new String[]{"Romania", "Bucuresti"});
        countries.put("FR", new String[]{"France", "Paris"});
        countries.put("IT", new String[]{"Italy", "Roma"});

        for (String key : countries.keySet()) {
            String value = Arrays.toString(countries.get(key));
            System.out.println(key + ":" + value);
        }
    }
}

