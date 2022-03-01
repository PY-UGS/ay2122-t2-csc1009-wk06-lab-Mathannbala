//to swap position. swap using index instead of value
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Question2 {

    public static LinkedList<Integer>SwapValues(LinkedList<Integer> ll, int indexOne, int indexTwo){
        //use a temp to store first index
        int temp = ll.get(indexOne);
        ll.set(indexOne,ll.get(indexTwo));
        ll.set(indexTwo,temp);
        return ll;
    }
//redoing in hash

    public static HashMap<Integer,Integer>swapValuesHash(HashMap<Integer,Integer>map, int indexOne, int indexTwo){
        //same as above, use temp
        int temp = map.get(indexOne);
        map.replace(indexOne, map.get(indexTwo));
        map.replace(indexTwo,temp);
        return map;
    }

}
