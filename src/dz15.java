import  java.util.Scanner;
public class dz15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sum = 1;
        while(true){
            double a = in.nextDouble();
            if(a == 0) break;
            sum = sum * a;
        }
        System.out.println(sum);
    }
}
