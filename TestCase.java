import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class TestCase {

    public static void main(String[] args){
        //Question 1 where Given a sorted integer liked list, say <1,3,5,7,9,11>, insert int in list
        LinkedList<Integer>list = new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);

        int value =2;
        Question1.addAndSort(list,value);

        //question 2 swap the position of two elements. Swap index 1 & index 5
        System.out.println("Question2: Result after swapping: " +Question2.SwapValues(list,1,5));

        //Question 3 to generate 500 random integer range from 1000 to 9999
        LinkedList<Integer>testLinkedList = new LinkedList<Integer>();
        Random randomNumber = new Random();

        for (int i=0; i<500;i++){

            int randomGenerated = 1000 + randomNumber.nextInt(10000);
            testLinkedList.add(randomGenerated);

        }
        int randomGeneratedValue = 1000 + randomNumber.nextInt(10000);
        System.out.println("Question3:" + Question3.findValue(testLinkedList,randomGeneratedValue));

        //Question 4 redoing question 1 using hash
        HashMap testMap = new HashMap<>();

        testMap.put(0, 1);
        testMap.put(1, 3);
        testMap.put(2, 5);
        testMap.put(3, 7);
        testMap.put(4, 9);
        testMap.put(5, 11);

        Question1.addAndSortUsingHash(testMap,value);

        //Question 5 redoing question 2 using hash
        System.out.println("Question5: Result after swapping: " +Question2.swapValuesHash(testMap,1,5));

        //Question 6 redoing question 3 using hash

        HashMap testMapRandom = new HashMap<>();

        for (int i =0; i<500; i++){

             int randomGenerated = 1000 + randomNumber.nextInt(10000);
            testMapRandom.put(i,randomGenerated);

        }
        System.out.println("Question6: " + Question3.findValueHash(testMapRandom,randomGeneratedValue));



    }
}
