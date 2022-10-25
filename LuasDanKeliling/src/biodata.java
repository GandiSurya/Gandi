/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LK5_8
 */
public class biodata {
    public static void main(String[] args) {
         String nama, alamat, hobi, citacita; 
         int umur, tinggibadan,nisn; 
   
         Scanner datadiri = new Scanner(System.in); 
 
         System.out.println("Data Siswa XI RC"); 
         System.out.println("Masukkan nama anda : "); 
         nama = datadiri.nextLine(); 
         System.out.println("Masukkan alamat anda : "); 
         alamat = datadiri.nextLine(); 
         System.out.println("Masukkan hobi anda : "); 
         hobi = datadiri.nextLine(); 
         System.out.println("citacita : "); 
         citacita = datadiri.nextLine(); 
      	
         System.out.println("Masukkan umur anda : "); 
         umur = datadiri.nextInt(); 
         System.out.println("Masukkan tinggibadan anda : "); 
         tinggibadan = datadiri.nextInt(); 
         System.out.println("nisn : "); 
         nisn = datadiri.nextInt(); 
      	
         System.out.println("Nama saya " + nama); 
         System.out.println("alamat saya " + alamat ); 
         System.out.println("Hobi saya " + hobi); 
         System.out.println("Citacita saya " + citacita); 
         System.out.println("umur saya " + umur); 
         System.out.println("tinggibadan saya " + tinggibadan ); 
         System.out.println("nisn " + nisn); 

     } 
 }

