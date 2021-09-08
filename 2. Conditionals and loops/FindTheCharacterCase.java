/*
Find Character Case

Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet
Input format 
Single Character
Output format 
1 or 0 or -1
Constraints 
Input can be any character
Sample Input 1 
v
Sample Output 1 
0
*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);

        if (a>='A'&& a<='Z'){
            System.out.println("1");
        }
        else if (a>='a' && a<= 'z'){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }

    }
}