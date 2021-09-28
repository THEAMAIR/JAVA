//Even and off sum
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int evenSum = 0 , oddSum =0;
        while(num>0){
            int last = num%10;
            if(last%2==0){
                evenSum = evenSum + last;
            }
            else{
                oddSum = oddSum + last;
            }
            num = num /10;
        }

        System.out.println(evenSum + " " + oddSum);
       

        }
    }