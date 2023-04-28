package com.Marks;

public class StudentMarks {

	public static void main(String[] args) {

		int m1 = 90;
		int m2 = 80;
		int m3 = 70;
		int m4 = 60;
		int m5 = 50;

		int pm = 35;

		int total = m1 + m2 + m3 + m4 + m5;

		int perc = total / 5;

		System.out.println("Total Marks is " + total + "\n");
		System.out.println("Percentage Is : " + perc + "\n");

		if (m1 >= pm && m2 >= pm && m3 >= pm && m4 >= pm && m5 >= pm) {

			System.out.println("Passed In All Subjects\n");
			if (perc >= 80) {
				System.out.println("Passed In Distinction Class");
			} else if (perc >= 70) {
				System.out.println("Passed in First Class");
			} else if (perc >= 60) {
				System.out.println("Passed in Secont Class");
			} else if (perc >= 50) {
				System.out.println("Passed in Thord Class");
			}

		} else {
			System.out.println("Failed One Or More Subjects\n");
			if (m1 < pm) {
				System.out.println("m1 Is Failed By : " + (pm - m1));
			}
			if (m2 < pm) {
				System.out.println("m2 Is Failed By : " + (pm - m2));
			}
			if (m3 < pm) {
				System.out.println("m2 Is Failed By : " + (pm - m3));
			}
			if (m4 < pm) {
				System.out.println("m2 Is Failed By : " + (pm - m4));
			}
			if (m5 < pm) {
				System.out.println("m2 Is Failed By : " + (pm - m5));
			}
		}

	}

}
