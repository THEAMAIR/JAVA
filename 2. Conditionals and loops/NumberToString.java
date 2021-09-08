import java.util.Scanner;
/* A program to print 
1-->One
2-->Two
3-->Three
*/
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a == 1){
            System.out.println("One");
        }else if(a == 2){
            System.out.println("Two");
        }
        else if (a==3){
            System.out.println("Three");
        }

    }
}