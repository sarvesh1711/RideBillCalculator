package com.aurionpro.model;

public class RideBillCalculator {
	private int height;
	private int age;
	private String wantPhoto;

	public static boolean enterHeight(int height) {
		if(height<120) {
			return false;
		}
		return true;
	}
	public static int ridingBill(int age) {
		if(age<12) {
			return 5;
		}
		else if(age>=12 && age<18) {
			return 7;
		}
		else if(age>=18) {
			return 12;
		}
		else if(age>=45 && age<=55) {
			return 0;
		}
		else {
			System.out.println("you can't ride");
			return 0;
		}
	}
	public static boolean photoCalculator(String wantPhotos) {
		if(wantPhotos.equalsIgnoreCase("yes")) {
			return true;
		}
		return false;
	}
}