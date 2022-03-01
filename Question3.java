//generate 500 random integer range from 1000 to 9999


import java.util.HashMap;
import java.util.LinkedList;

public class Question3 {


    public static int findValue(LinkedList<Integer>list,int searchValue){

        int temp = 0;

        if(list.contains(searchValue)){

            for(int i=0; i<list.size();i++){

                if(list.get(i)==searchValue)
                    temp =i;
            }

        }
        else {
            return -1;
        }
        return temp;
    }


    //redoing in hash
    public static int findValueHash(HashMap<Integer,Integer>map, int searchValue){
        int temp =0;

        if(map.containsValue(searchValue)){

            for(int i=0; i<map.size();i++){

                if(map.get(i)==searchValue){
                    temp=i;
                }
            }
        }
        else{
            return -1;

        }
        return temp;
    }
}
