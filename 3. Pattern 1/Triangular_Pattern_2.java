
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;
        int val = 1;
        while(row<=n){
            int colum =1;
            while(colum<=row){
                System.out.print(val);
                val = val + 1;
                colum = colum + 1;
            }
            System.out.println();
            row = row + 1;
        }

        }
    }