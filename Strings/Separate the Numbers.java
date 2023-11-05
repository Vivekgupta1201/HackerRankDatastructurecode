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
 public static boolean checkvalid(String newstr,String oldstr){
         
          Long num = Long.parseLong(newstr);
          
         while(newstr.length()<=oldstr.length()){
              if(oldstr.equals(newstr)){
                 return true;
             }
             else
            newstr+=Long.toString(++num);  
         }
         return false;
     }
     
public static void separateNumbers(String s) {
    // Write your code here
    int flag=0;
    for(int i=1;i<=s.length()/2;i++){
       String current= s.substring(0,i);
        
       if(checkvalid(current,s)){
           flag=1;
           System.out.println("YES"+" "+current);
           break;
       }
    }
    if(flag!=1)
     System.out.println("NO");
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
