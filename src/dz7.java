import java.util.Scanner;
public class dz7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        for(int i = n; i <=m; i++){
            sum = sum + n;
            n++;
        }
        System.out.println(sum);
    }
}