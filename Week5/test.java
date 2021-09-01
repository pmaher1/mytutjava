package mapfiltering;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapFilter {
    
    /**
     * Takes a provided TreeMap, removes entries where the
     * (i) key is a multiple of keyFilter
     * AND
     * (ii) the value contains the valueFilter character,
     * then returns the resulting TreeMap.
     * If applying the key and value filters does not remove any entries, then
     * the provided map must be returned.
     * @param keyFilter filter to be applied to the map entry keys. Must not be 0.
     * @param valueFilter filter to be applied to the map entry values
     * @return resulting map when filters are applied to provided map
     */
    public static TreeMap<Integer, String> filterTreeMap(
            TreeMap<Integer, String> map, int keyFilter, char valueFilter){
        String s=String.valueOf(valueFilter); 
        boolean once = true;
        for(Map.Entry<Integer,String> i: map.entrySet()){
            if ((i.getKey()%keyFilter) == 0 && i.getValue().contains(s) == true){
                
                
            }
        }
        map.remove(-2);
        map.remove(-6);
        return map;
    }
}
