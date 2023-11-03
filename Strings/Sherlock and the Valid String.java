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

   

    public static String isValid(String s) {
    // Write your code hereCollections.min(Str.values());
            
        HashMap<Character,Integer> Str=new HashMap<>();
        for(char c:s.toCharArray()){
            if(Str.containsKey(c))
          Str.put(c, Str.get(c) + 1);
          else
          Str.put(c,1);
        }
        int count=Str.get(s.charAt(0));
       
        
        int error=0;
        
         for(int frequency : Str.values()){
             
             if(frequency==1&&error<1){
                 error++;
             }
            
           else   if(frequency!=count){
                 if(Math.abs(frequency-count)>1){
                     return "NO";
                 }
                 else{
                  
                     error++;
                   
                 }
             }
              if(error>1)
             return "NO";
         
         }
        
        
        
return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
