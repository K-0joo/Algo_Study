import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try {
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            String line = "";
            for(int i = 1; (line = br.readLine()) != null; i++){
                System.out.println(line);
            }
        } catch (IOException e){}
       
    }
}
