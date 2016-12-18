package assignment ;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a ");
		a=sc.nextInt();
		System.out.println("enter b ");
		b=sc.nextInt();
		c=a-~b-1;	
	 System.out.println("value "+c);
	}

}
