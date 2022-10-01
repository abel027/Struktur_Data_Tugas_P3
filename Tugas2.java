/*
	program		: Tugas2.java
	pembuat		: Muhammad Abbel prasetya
	tanggal		: 24/09/2022
	deskripsi	: program yang menghitung serta menampilkan besar diskon (jika ada) serta nilai
				  belanja setelah diskon
	
*/
import java.util.Scanner;
public class Tugas2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int total,diskon,totalbelanja;
		System.out.println("===Program Kasir Toko ===");
		System.out.print("Masukkan Total Belanja = ");
		total=in.nextInt();
		if (total >= 100000){
			diskon=(10 * total)/100;
			System.out.println("Diskon 10% = Rp." +diskon);
			totalbelanja=total-diskon;
			System.out.println("Total Belanja =Rp." +totalbelanja);
		}
		else{
			System.out.println("Total Belanja = Rp." +total);
		}
		System.out.println("------------------------------------------");	
		System.out.print("Terimakasih Sudah Berbelanja disini ^_^ ");	
	}
}