/*
	program 	: Tugas3.java
	pembuat		: Muhammad Abbel Prasetya
	tanggal		: 24/09/2021
	deskripsi 	: menghitung biaya yang harus dibayar pelanggan warnet
	
*/
import java.util.Scanner;
public class Tugas3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int jam,bayar,biaya,penambahan;
		System.out.println("===Program Pelangganan Warnet ===");
		System.out.print("Masukkan Total lama Pemakaian = ");
		jam=in.nextInt();
		if(jam == 3){
			bayar=jam*3000;
		}
		else{
			biaya=3 * 3000;
			penambahan=(jam-3)*2000;
			bayar=biaya+penambahan;
		}
		System.out.print("Total Tarif = Rp."+bayar);	
	}
}