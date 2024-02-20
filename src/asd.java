import java.util.Scanner;
public class asd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a % 7 == 1){
            System.out.println(4);
        }
        else if(a % 7 == 2){
            System.out.println(5);
        }
        else if(a % 7 == 3){
            System.out.println(6);
        }
        else if(a % 7 == 4){
            System.out.println(0);
        }
        else if(a % 7 == 5){
            System.out.println(1);
        }
        else if(a % 7 == 6){
            System.out.println(2);
        }
        else if(a % 7 == 0){
            System.out.println(3);
        }
    }
}