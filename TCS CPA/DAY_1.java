import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc =  new Scanner(System.in);
		int id = sc.nextInt();
		sc.nextLine(); 
		// after transition from int to string we need to move cursor that's why new line
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		float marks1 = sc.nextFloat();
		float marks2 = sc.nextFloat();
		float marks3 = sc.nextFloat();
		boolean active = sc.nextBoolean();
		double result = marks1 + marks2 + marks3;
		
		System.out.println(id + "\n" + name + "\n" + gender + "\n" + active + "\n" + result);
		
		//Round off
		
		String s1 = String.format("%.2f",result);
		System.out.println(s1);
		
		System.out.format("%.4f",result);
		
		//Type conversion
		
		//automatic casting
		int xy = 65;
		double d = xy;
		
		//manual casting
		double z = 45.56;
		int a = (int)z;
		System.out.println(z);
		System.out.println(a);
		
		// for getting 4.5 otherwise if double not added then
		// ans we get is 4 
		double b = (double)9/2;
		
		//operator precedenece
		
		//  *,/,%,+,-
		
		
		
	}
}
