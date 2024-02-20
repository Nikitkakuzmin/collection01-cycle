import java.util.Scanner;
public class dz13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int max = 0;

        while (true){
            int n = in.nextInt();
            if(n == 0) break;
            if( n > max)
                max = n ;

        }
        System.out.println(max);

    }
}