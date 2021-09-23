import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int basesalary = scan.nextInt();
        char grade = scan.next().charAt(0); 
        System.out.print(basesalary + " " + grade + "\n");
        double hra = (20*basesalary)/100;
        double da = (50*basesalary)/100;
        double pf = (11*basesalary)/100;
        int allowance;
        if(grade == 'A'){
            allowance = 1700;
        }
        else if (grade == 'B'){
            allowance = 1500;
        }
        else{
            allowance = 1300;
        }
        double salary = basesalary + hra + da + allowance - pf;
        System.out.println(Math.round(salary));

        }
    }