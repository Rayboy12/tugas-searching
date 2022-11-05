
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEXIS
 */
public class tugaspercabangan {
      public static int main(String[] args) {
         String nim, nama, prodi, matkul;
         int nilai;
         Scanner masukan = new Scanner (System.in);
         System.out.println("Masukan nim = ");
         nim = masukan.nextLine();
         System.out.println("Masukan nama = ");
         nama = masukan.nextLine();
         System.out.println("Matkul = ");
         matkul = masukan.nextLine();
         System.out.println("Masukan nilai angka = ");
         nilai = masukan.nextInt();
         //mengambil jurusan dari NIM
         prodi = nim.substring(3, 5);
            if (nilai >= 90 ) {
                System.out.println("Pertahankan! \n");
  }
  else if (nilai >= 80 && nilai < 90) {
                System.out.println("Harus lebih baik lagi \n");
  }
  else if (nilai >= 60 && nilai < 80) {
                System.out.println("Perbanyak belajar \n");
  }
  else if (nilai >= 40 && nilai < 60) {
                System.out.println("Jangan keseringan main \n");
  }
  else if (nilai < 40) {
                System.out.println("Kebanyakan bolos... \n");
  }
  else {
                System.out.println("Maaf, format nilai tidak sesuai \n");
  }
  return 0;
}   
    
}




