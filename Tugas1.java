/*
	program 	: Tugas1.java
	pembuat		: Muhammad Abbel Prasetya
	tanggal		: 24/09/2021
	deskripsi 	: Program menentukan apakah bilangan tersbut merupakan bilangan 
				  kelipatan 3 yang ganjil atau bukan
	
*/
import java.util.Scanner;
public class Tugas1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int bil;
		System.out.println("===Program Perulangan Kelipatan 3 ===");
		System.out.print("Masukkan Sebuah Bilangan Bulat = ");
		bil=in.nextInt();
		if (bil%3==0 && bil%2!=0){
			System.out.println("Bilangan "+bil+" Merupakan Bilangan ganjil kelipatan 3");
		}
		else{
			System.out.print("Bilangan "+bil+" Bukan Bilangan ganjil kelipatan 3");
		}
	}
}