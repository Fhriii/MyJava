import java.io.*;
public class rumusswitch{
 public static void main(String[]args) throws IOException{
  String ulang="Y";
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  while (ulang.equals("Y") || ulang.equals("y"))
  {
  System.out.println("==================================");
  System.out.println("Rumus Matematika : ");
  System.out.println("Kode 1 : Luas Segitiga");
  System.out.println("Kode 2 : Luas Persegi Panjang");
  System.out.println("==================================");
  System.out.println("Masukkan kode rumus : ");
  int kode = Integer.parseInt(br.readLine());
  System.out.println(kode);
       Double Luas;
    switch(kode){
     case 1:
             System.out.print("Masukkan Alas: ");
             Double Alas = Double.parseDouble(br.readLine());
             System.out.println(Alas);
             System.out.print("Tinggi: ");
             Double Tinggi = Double.parseDouble(br.readLine());
             System.out.println(Tinggi);
             Luas = Alas * Tinggi * 0.5;
             System.out.println("Luas Segitiga = " + Luas);
         break;
     case 2:
             System.out.print("Masukkan Panjang: ");
             Double Panjang = Double.parseDouble(br.readLine());
             System.out.println(Panjang);
             System.out.print("Masukkan Lebar: ");
             Double Lebar = Double.parseDouble(br.readLine());
             System.out.println(Lebar);
             Luas = Panjang * Lebar ;
             System.out.println("Luas Segitiga = " + Luas);
         break;
         default: System.out.println(" Kode tidak ada");


       }
      System.out.println("Hitung lagi? (Y/N) ??");
      ulang=br.readLine();
      System.out.println("========================");

    }
 }
}