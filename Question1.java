import java.util.HashMap;
import java.util.LinkedList;

public class Question1 {

    public static void addAndSort(LinkedList<Integer> list, int value) {

        System.out.println("Question1: Before adding and sorting: " + list);
        list.add(value);
        boolean sorter = false;

        //Include a loop in case number are not in order.
        while (sorter==false) {

            sorter = true;

            for (int i = 0; i < list.size() - 1; i++) {

                if (list.get(i) > list.get(i + 1)) {

                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorter = false;

                }
            }
        }
        System.out.println("Question1: After adding & sorting: " + list);


    }

    //redoing in hash
    public static void addAndSortUsingHash(HashMap<Integer, Integer> map, int value) {

        System.out.println("Question4: Before adding and sorting (using Hash): " + map);
        //based on lab, use 6
        map.put(6, value);
        boolean sorter = false;
        while (sorter==false) {

            sorter =true;

            for (int i = 0; i < map.size() - 1; i++) {
                if (map.get(i) > map.get(i + 1)) {
                    int temp = map.get(i);
                    map.replace(i, map.get(i + 1));
                    map.replace(i + 1, temp);

                    sorter = false;
                }



            }

        }
        System.out.println("Question4: After adding & sorting (using hash): " + map);

    }
}