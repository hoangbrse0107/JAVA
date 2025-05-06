package hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) { // main

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String name = scanner.nextLine();
		System.out.println("Nhap diem: ");
		int score = scanner.nextInt();

		System.out.println(name + " has score = " + score);
		scanner.close();
	}

}
