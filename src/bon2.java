import java.util.Scanner;
public class bon2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // dollary na perviy
        int b = in.nextInt(); // imeuwiesia dollary
        int c = in.nextInt(); //  neobhodimo kupit
        int sum = 0;
        int v = 0;
        int res = 0;
        for(int i = 1; i <= c; i++){
            v = a * i;
            sum = sum +v;
        }
        res = sum - b;
        if(res != 0) {
            System.out.println(res);
        }
        else if( res == 0){
            System.out.println();
        }
    }
}
