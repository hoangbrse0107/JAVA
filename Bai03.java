package hoidanit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("Bai 03 run");

		// Tính và xuất ra thể tích của hình lập phương.
		System.out.println("Nhap canh cua hinh lap phuong: ");
		Scanner scanner = new Scanner(System.in);
		int canh = scanner.nextInt();
		double theTich = Math.pow(canh, 3);
		System.out.println("The tich = " + theTich);
	}
}
