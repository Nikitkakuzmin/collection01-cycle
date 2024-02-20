import java.util.Scanner;
public class dz10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int num = 1;
        for(int i = 3;num <= n; i = i + 3){
            sum = sum +i;
            num++;
        }
        System.out.println(sum);
    }
}
