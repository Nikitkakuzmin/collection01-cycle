import java.util.Scanner;
public class prak9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double sum = 0;
        double c = 0;
        for(double i = a; i <= b; i ++ ){
            c++;
            sum = sum +a;
            a++;
            System.out.println(sum/c);
        }



    }
}
