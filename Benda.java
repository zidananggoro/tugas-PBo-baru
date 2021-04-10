package com.PenugasanPBo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Benda {
    Scanner run = new Scanner(System.in);
    int semua;

    int[] kodebarang = new int[50];
    int[] harga = new int[50];
    int[] stok = new int[50];
    int[] nilai = new int[50];
    String[] nama = new String[50];

    public Benda(){

    }
    public void masukkanData(){
        try{
            for(int r=0;r < semua;r++){
                System.out.println("Produk nomer"+(r+1));
                System.out.println("nama produk \t \ttekan 0 jika tidak jadi : ");

                run.nextLine();
                kodebarang[r]=r+1;
                nama[r] = run.nextLine();

                if (nama[r].equals("0")){
                    break;
                }

                System.out.println("harga produk : ");
                harga[r]= run.nextInt();
                System.out.println("stok produk : ");
                stok[r]= run.nextInt();
                nilai[r]=stok[r]*harga[r];
            }
        }catch (InputMismatchException e){
            System.out.println("nomer yang anda masukkan harus angka ");
            run.nextLine();
            menu();
        }
    }
    public void menu(){
        do{
            System.out.println("masukkan nomer produk : ");
            semua = run.nextInt();

            if (semua <= 0){
                System.out.println("yang anda masukkan lebih dari 0");
            }else {
                masukkanData();
            }
        }while (semua <= 0);
    }
    public void getnilaidata(){
        for (int r =0; r < semua; r++){
            System.out.println("nomer produk : "+kodebarang[r]);
            System.out.println("nama produk : "+ nama[r]);
            System.out.println("harga produk : "+harga[r]);
            System.out.println("stok produk : "+stok[r]);
            System.out.println("nilai produk : "+nilai[r]);
        }
    }

}
