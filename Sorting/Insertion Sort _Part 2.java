import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */public static void print(List<Integer> a){
         for(int i=0;i<a.size();i++){
             System.out.print(a.get(i)+" ");
             
         }
         System.out.println();
     }

    public static void insertionSort2(int n, List<Integer> arr) {
    // Write your code here
    for(int i=1;i<n;i++){
        int current=arr.get(i);
        int index=i-1;
        while(index>=0&&current<arr.get(index)){
        
            arr.set(index+1,arr.get(index));
           
            index--;
             
        }
        arr.set(index+1,current);
               print(arr);
      
     
    }
   // System.out.println(arr);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort2(n, arr);

        bufferedReader.close();
    }
}
