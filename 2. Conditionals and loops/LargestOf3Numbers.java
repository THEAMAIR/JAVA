import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a>=b && a>=c){
            System.out.println(a + " is greater");
        }
        else if(b>=c && b>=a){
            System.out.println(b + " is greater");
        }
        else{
            System.out.println(c + " is greater");
        }

    }
}