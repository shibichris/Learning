package com.dekteguh.percabangan;

public class PercabanganIfBersarang {
    public static void main(String[] args) {
        int i = 75;
        //contoh percabangan if bersarang
        if(i>=90){
            System.out.println("cetak huruf A");
        }else if(i>=80){
            System.out.println("cetak huruf B");
        }else if(i>=70){
            System.out.println("cetak huruf C");
        }else if(i>=60){
            System.out.println("cetak huruf D");
        }else if(i>=50){
            System.out.println("cetak huruf E");
        }else{
            System.out.println("Huruf mutu F");
        }
    }
}
