import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String n = br.readLine();
            
            String sumN = "";
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            for(int i = 0; i < Integer.parseInt(n); i++){
                sumN = br.readLine();
                String[] nums = sumN.split(" ");
                bw.write((Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])) + "\n");
            }
            
            bw.close();
        } catch (IOException e){
            
        }
    }
}
