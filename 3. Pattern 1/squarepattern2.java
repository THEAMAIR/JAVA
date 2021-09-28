//Even and off sum
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;
        while(row<=n){
            int colum =1;
            while(colum<=n){
                System.out.print(colum);
                colum = colum + 1;
            }
            System.out.println();
            row = row + 1;
        }

        }
    }