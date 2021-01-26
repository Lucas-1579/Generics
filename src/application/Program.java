package application;

import java.util.Scanner;

import service.PrintServices;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintServices<Integer> pss = new PrintServices<>();
		
		System.out.print("Enter with a number: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			pss.addValue(value);
		}
		
		pss.print();
		System.out.println("First: " + pss.first());
		
		
		
		sc.close();

	}

}
