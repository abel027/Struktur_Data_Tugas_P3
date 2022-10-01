/*
	program 	: Tugas4.java
	pembuat		: Muhammad Abbel Prasetya
	tanggal		: 24/09/2022
	deskripsi 	: program yang menghitung total biaya tiket yang harus dibayar penumpang
	
*/
import java.util.Scanner;
public class Tugas4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		long total=0,kelas,jumlah,eko,supek,eks;
		long diskon=0,bayar=0;
		System.out.println("===Program Tiket Bus===");
		System.out.println("===Kelas Tiket===");
		System.out.println("1.Ekonomi");
		System.out.println("2.Eksekutif");
		System.out.println("3.Super Eksekutif");
		System.out.print("Silahkan Pilih Kelas Tiket Anda = ");
		kelas=in.nextLong();
		System.out.print("Jumlah Tiket = ");
		jumlah=in.nextLong();
		if(jumlah>4){
			if(kelas==1){
				eko=350000;
				total=jumlah*eko;
				diskon=(total*10)/100;
				bayar=total-diskon;
			}
			else if(kelas==2){
				eks=500000;
				total=jumlah*eks;
				diskon=(total*10)/100;
				bayar=total-diskon;
			}
			else if(kelas==3){
				supek=650000;
				total=jumlah*supek;
				diskon=(total*10)/100;
				bayar=total-diskon;
			}	
		}
		else{
			if(kelas==1){
				eko=350000;
				total=jumlah*eko;
				diskon=0;
				bayar=total-diskon;
			}
			else if(kelas==2){
				eks=500000;
				total=jumlah*eks;
				diskon=0;
				bayar=total-diskon;
			}
			else if(kelas==3){
				supek=650000;
				total=jumlah*supek;
				diskon=0;
				bayar=total-diskon;
			}	
		}
		System.out.println("Total Harga Tiket = Rp."+total);
		System.out.println("Diskon = Rp."+diskon);	
		System.out.println("Total Tarif = Rp."+bayar);	
	}
}