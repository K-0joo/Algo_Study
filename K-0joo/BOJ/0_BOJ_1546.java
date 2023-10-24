import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] score = new int[n];
        float[] fakeScore = new float[n];
        
        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
            //System.out.println("score [" + i + "] = " + score[i]);
            if(max <= score[i]){
                max = score[i];
            }
        }
        
        float sum = 0;
        
        for(int j = 0; j < n; j++){
            //System.out.println("max = " + max);
            fakeScore[j] = (float)score[j] / max * 100;
            //System.out.println("fakeScore [" + j + "] = " + score[j] / max);
            sum += fakeScore[j];
            
            //System.out.println("sum = " + sum);
        }
        
        float avg = sum / n;
        
        System.out.println(avg);
        
    }
}
