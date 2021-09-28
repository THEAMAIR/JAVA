
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;
        while(row<=n){
             char x = (char)('A' + n - row ) ;
            int colum = 1;
            while(colum<=row){
                System.out.print(x);
                x++;
                colum = colum + 1;

            }
            System.out.println();
            row = row + 1;
        }

        }
    }