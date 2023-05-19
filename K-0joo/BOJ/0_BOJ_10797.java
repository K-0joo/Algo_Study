import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();
        
        int[] car = new int[5];
        
        int nonum = day%10;
        
        int count = 0;
        
        for(int i = 0; i < 5; i++){
            car[i] = sc.nextInt();
            
            if(nonum == car[i]){
                count++; 
            }
        }
        
        System.out.println(count);
        
    }
}
