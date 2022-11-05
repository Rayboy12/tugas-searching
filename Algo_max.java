/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEXIS
 */
public class Algo_max {
    public static void main(String[] args) {
        //Initialize array
int [] arr = new int [] {44, 23, 55, 76, 21, 100};
//inisialisasi nilai awal min.
int max = arr[0];
//perulangan dengan array
for (int i = 0; i < arr.length; i++) {
//Membandingkan dengan max
if( arr[i] > max ){
max = arr[i];
}
}
System.out.println(" Bilangan terbesar di dalam array adalah: " + max);
        
        
        
    }  
}
