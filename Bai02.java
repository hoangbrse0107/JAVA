package hoidanit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("Bai 02 run");

//		- chu vi hình chữ nhật
//		- diện tích hình chữ nhật
//		- cạnh nhỏ nhất của hình chữ nhật
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap CD: ");
		int CD = scanner.nextInt();
		System.out.println("Nhap CR: ");
		int CR = scanner.nextInt();

		int chuVi = (CD + CR) * 2;
		int dienTich = CD * CR;
		int canhMin = Math.min(CD, CR);

		System.out.println("Chu vi = " + chuVi);
		System.out.println("dienTich = " + dienTich);
		System.out.println("canh Min = " + canhMin);
		scanner.close();
	}

}
