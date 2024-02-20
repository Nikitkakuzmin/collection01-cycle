import  java.util.Scanner;
public class dz16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int a = in.nextInt();
            if(a == 0) break;
            if(a % 2 != 0){
                sum= sum + a;
            }

        }
        System.out.println(sum);
    }
}
