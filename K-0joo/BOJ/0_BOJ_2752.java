import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);       
        
        // 배열 정렬을 하기 위해 배열 선언
        int[] nums = new int[3];
        
        // 3개까지 받기
        for(int i = 0; i < 3; i++){
            nums[i] = sc.nextInt();
        }
        
        //오름차순 정렬
        Arrays.sort(nums);
        
        int Max = nums[2];
        int Min = nums[0];
        int num = nums[1];
        
        System.out.println(Min + " " + num + " " + Max);
        
    }
}
