/*
The program will recieve 3 English words inputs from STDIN

These three words will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by *
The second word should be changed like all consonants should be replaced by @
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them
Other than these concatenated word, no other characters/string should or message should be written to STDOUT

For example if you print how are you then output should be h*wa@eYOU.

You can assume that input of each word will not exceed more than 5 chars

Test Cases
Case 1
Input

how
are
you
Expected Output : h*wa@eYOU

Case 2
Input

how
999
you
Expected Output : h*w999YOU

 */


import java.lang.*;
import java.util.Scanner;
public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String words[] = new String[3];
        System.out.print("Enter the 3words: ");
        for (int j = 0; j < words.length; j++) {
            words[j] = sc.next();
            {
                if (j == 0) {
                    char a[] = words[j].toCharArray();
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U')
                            a[i] = '*';
                    }
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]);
                    }
                    System.out.print(" ");
                }
                if (j == 1) {
                    char a[] = words[j].toCharArray();
                    for (int i = 0; i < a.length; i++) {
                        if (!(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U'))
                            a[i] = '@';
                    }
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]);
                    }
                    System.out.print(" ");
                }
                if (j == 2) {
                    char a[] = words[j].toCharArray();
                    for (int i = 0; i < a.length; i++) {
                        if (Character.isLetter(a[i]) && Character.isLowerCase(a[i]))
                            a[i] = Character.toUpperCase(a[i]);
                    }
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]);
                    }
                }
            }
        }
    }
}