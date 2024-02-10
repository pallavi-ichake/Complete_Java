package ArrayReverse;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfMultipleArrays
{
    static void intersection(Integer[] ... inputArrays)
    {      
        System.out.println("Input Arrays :");  
        for (Integer[] inputArray : inputArrays) 
        {
            System.out.println(Arrays.toString(inputArray));
        } 
        HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(inputArrays[0]));   
        for (int i = 1; i < inputArrays.length; i++) 
        {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[i]));
              
            intersectionSet.retainAll(set);
        }         
        System.out.println("Intersection Of All Input Arrays :");   
        System.out.println(intersectionSet);
    } 
    public static void main(String[] args)
    {    
        Integer[] inputArray1 = {2, 3, 4, 7, 1};
        Integer[] inputArray2 = {4, 1, 3, 5}; 
        Integer[] inputArray3 = {8, 4, 6, 2, 1};
        intersection(inputArray1, inputArray2, inputArray3);
    }
}
