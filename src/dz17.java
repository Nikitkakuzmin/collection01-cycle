import  java.util.Scanner;
public class dz17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        int c = 0;
        for(int i = 1; i <= a; i ++){
            c = i*i;
            sum =sum + c;
        }
        System.out.println(sum);

    }
}