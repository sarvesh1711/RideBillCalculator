package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.RideBillCalculator;

public class RideBillCalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RideBillCalculator obj = new RideBillCalculator();
		System.out.println("WELCOME TO RIDE BILL CALCULATOR ! ");
		System.out.println("enter your height : ");
		int height = sc.nextInt();
		if (obj.enterHeight(height)) {
			System.out.println("you can ride !");
			System.out.println("enter your age : ");
			int age = sc.nextInt();
			int rideBill = obj.ridingBill(age);
			System.out.println("your riding bill is : " + rideBill + "$");
			sc.nextLine();
			System.out.println("do you want to take photos (3$ will be extra added to the final bill) : ");
			String wantPhotos = sc.nextLine();
			if (obj.photoCalculator(wantPhotos)) {
				System.out.println("final riding bill is : " + (rideBill + 3) + "$");
			} else {
				System.out.println("final riding bill is : " + rideBill + "$");
			}
		} else {
			System.out.println("you can not ride !!!!");
		}
	}
}