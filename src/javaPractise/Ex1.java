package javaPractise;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
//		//printing 2 new lines with 1 sysout statement  using line separator
//		
//		System.out.print("Lakshmi"+ System.getProperty("line.separator")+ "Madhu");
//		
//		//input data from user and print 
//		Scanner scanner = new Scanner(System.in);
//		int a =3;
//		for(int i =a; i>0;i--){
//			int input1 = scanner.nextInt();
//		
//		System.out.println(input1);
//		
//		}
		
		//if-else loop
		
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n>=1 && n<=100){
		if((n%2)!=0){
			System.out.println("Wierd");
		}
		else{
			
		if(n%2==0 && (n>=2 && n<=5)){
			System.out.println("Not Wierd");
		}
		else if(n%2==0 && (n>=6 && n<=20)){
			System.out.println("Wierd");
			
		}
		else if(n%2==0 && n>20)
		{
			System.out.println("Not Wierd");
		}
		} 
		}
		
	}

}


