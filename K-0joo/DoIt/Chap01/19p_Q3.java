/**
 * 네 값의 최소 값을 구하는 min4 메서드를 작성하세요.
 * 
 * static int min4(int a, int b, int c, int d)
 */
import java.util.Scanner;
 
 class Min4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("네 정수의 최솟값을 구합니다.");
        System.out.print("a의 값: "); a = stdIn.nextInt();
        System.out.print("b의 값: "); b = stdIn.nextInt();
        System.out.print("c의 값: "); c = stdIn.nextInt();
        System.out.print("d의 값: "); d = stdIn.nextInt();

        System.out.println("최솟값은 " + min4(a, b, c, d) + "입니다.");
    }
 }
