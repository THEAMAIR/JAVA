import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        //1. Import files of inbuilt scanner using java.util.Scanner
        //2. Write scan command which is Scanner scan = new Scanner(System.in);
        //3. take input in int a and b using scan.nextInt()
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = a+b;
        System.out.println("Sum = " + c );
    }
}