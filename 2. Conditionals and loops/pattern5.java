import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while (i<=n){
            int  space = 1;
            while(space<=n-i){
                System.out.print(" ");
                space = space + 1;
            }
            int j = 1;
            while(j<=i){
                System.out.print(i+j-1);
                j = j+1;
            }
            System.out.println();
            i = i+1;
        }
        
    }
}