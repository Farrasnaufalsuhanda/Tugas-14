package Database;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaksi extends Barang {
    Scanner input = new Scanner(System.in);

	    
    @Override
    public void namaBarang() {
        System.out.print("Inputkan Nama Barang  = ");
        namaBarang = input.next();
    }
    
    @Override
    public void hargaBarang() {  
        System.out.print("Inputkan Harga Barang  = ");
        hargaBarang = input.nextInt();
    }

    @Override
    public void jumlah() {
        System.out.print("Inputkan Jumlah Barang  = ");
        jumlah = input.nextInt();
    }

    @Override
    public void noFaktur() {
        System.out.print("Inputkan No Faktur  = ");
        noFaktur = input.nextInt();
    }


    @Override
    public void subTotal() {
        subTotal = hargaBarang * jumlah;
    }

    
    @Override
    public void discount() {
        if (subTotal >= 100000){
            discount = subTotal * 30/100;
        }

        else if (subTotal >= 50000){
            discount = subTotal * 20/100; 
        }

        else if (subTotal >= 25000){
            discount = subTotal * 10/100;
        }

        else {
            discount = 0;

        }
    }
 
    @Override
    public void totalHarga() {
        totalHarga = subTotal - discount;
    }

	public void Date(){
        Date harisekarang = new Date();
        SimpleDateFormat tf = new SimpleDateFormat("E yyyy.MM.dd");
        System.out.println("Tanggal Transaksi : " + tf.format(harisekarang));
    }

    
    public void display(){
        System.out.println("========TRANSAKSI========");
        Date();
        System.out.println("No Faktur Barang    = " + noFaktur);
        System.out.println("Nama Barang         = " + namaBarang);
        System.out.println("Harga Barang        = " + hargaBarang);
        System.out.println("Jumlah Barang       = " + jumlah);
        System.out.println("Sub Total Transaksi = " + subTotal);
        System.out.println("Discount Barang     = " + discount);
        System.out.println("Total Transaksi     = " + totalHarga);
    }
}

