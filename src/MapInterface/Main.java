package MapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Maps - represents the mappings between a Key and a Value in key-value pairs.\n" +
                "\tUsed to perform look up by keys to access the value (data) attached to that particular key.");

        //To instantiate Maps
        Map <Integer, String> graduationList = new HashMap<>();

        //To add record to the map
        graduationList.put(1, "Peter Mwangi");
        graduationList.put(2, "Gish Lenny");
        graduationList.put(3, "All soaps");
        graduationList.put(4, "Enjoy the moments, these are the good old days");

        //To output all records
        System.out.println(graduationList);

        //To output a specific record
        System.out.println(graduationList.get(4));

        //To remove an element from a map
        graduationList.remove(4);

        //To check the size of the map
        System.out.println(graduationList.size());

        //Boolean to check if a key is contained in the map
        System.out.println("Is this record contained in the map:\n" + graduationList.containsKey(2));

        //To replace / edit existing records
        graduationList.replace(3, "Ngara");
        System.out.println(graduationList.get(3));

        //To clear all the records
        graduationList.clear();

        System.out.println("No record. All records are cleared.\n" + graduationList);

        //Passing a class as a datatype when instantiating an array list
        ArrayList <Flight_manifest> flightRecords = new ArrayList<>();

        //To add record
        flightRecords.add(new Flight_manifest("flight 101", "Kenya Airways", 198));

        //To output the record
        System.out.println(flightRecords.getLast().getAirline());

        //To iterate the array list using the for each loop
        for (Flight_manifest manifest:flightRecords) {
            System.out.println(manifest.getPax());

            //editing the airline value using setter method
            manifest.setAirline("Qatar airways");
            System.out.println(manifest.getAirline());
        }

        //Methods in java map interface
//        Method	Action Performed
//        clear()	This method is used in Java Map Interface to clear and remove all of the elements or mappings from a specified Map collection.
//                containsKey(Object)	This method is used in Map Interface in Java to check whether a particular key is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
//                containsValue(Object)	This method is used in Map Interface to check whether a particular value is being mapped by a single or more than one key in the Map. It takes the value as a parameter and returns True if that value is mapped by any of the keys in the map.
//        entrySet()	This method is used in Map Interface in Java to create a set out of the same elements contained in the map. It basically returns a set view of the map or we can create a new set and store the map elements into them.
//                equals(Object)	This method is used in Java Map Interface to check for equality between two maps. It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not.
//                get(Object)	This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key.
//        hashCode()	This method is used in Map Interface to generate a hashCode for the given map containing keys and values.
//                isEmpty()	This method is used to check if a map is having any entry for key and value pairs. If no mapping exists, then this returns true.
//                keySet()	This method is used in Map Interface to return a Set view of the keys contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
//                put(Object, Object)	This method is used in Java Map Interface to associate the specified value with the specified key in this map.
//                putAll(Map)	This method is used in Map Interface in Java to copy all of the mappings from the specified map to this map.
//                remove(Object)	This method is used in Map Interface to remove the mapping for a key from this map if it is present in the map.
//        size()	This method is used to return the number of key/value pairs available in the map.
//                values()	This method is used in Java Map Interface to create a collection out of the values of the map. It basically returns a Collection view of the values in the HashMap.
//        getOrDefault(Object key, V defaultValue)	Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
//        merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)	If the specified key is not already associated with a value or is associated with null, associate it with the given non-null value.
//                putIfAbsent(K key, V value)	If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current associate value.

    }


}
