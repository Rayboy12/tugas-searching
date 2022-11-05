/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEXIS
 */
public class Algo_min {
    public static void main(String[] args) {
        //Initialize array
int [] arr = new int [] {44, 23, 55, 76, 21, 100};
//inisialisasi nilai awal min.
int min = arr[0];
//perulangan dengan array
for (int i = 0; i < arr.length; i++) {
//Membandingkan elemen array ke I terhadap nilai min
if(arr[i] <min)
min = arr[i];
}
System.out.println(" Bilangan terkecil di dalam array adalah: " + min);



        
        
    }
}
