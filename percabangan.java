
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEXIS
 */
public class percabangan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Angka =");
        int angka = masukan.nextInt();
        if (angka%2==0) {
            System.out.println("BIlangan Genap");
        }   else {
            System.out.println("Bilangan Ganjil");
        }
                
        String hasil = angka%2==0? "Bilangan Genap":"Bilangan Ganjil";
        System.out.println(hasil);
                 
               
                
                
                
                
                
        
    
                }     
                
    }
  
