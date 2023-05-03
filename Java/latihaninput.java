import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 public class latihaninput{
   public static void main(String[]args){
       BufferedReader dataIn = new BufferedReader
       (new InputStreamReader(System.in));
       String name ="";
       String kelas="";
       String sekolah ="";
       System.out.println("BIODATA");
       System.out.println("==========");

       System.out.print("Tuliskan Nama = ");
       try{
       name=dataIn.readLine();
       }catch(IOException e ){
       System.out.print("error");
       }
       System.out.println(name) ;


       System.out.print("Tuliskan kelas = ");

       try{
       kelas=dataIn.readLine();
       }catch(IOException e ){
       System.out.print("error"); }

       System.out.println(kelas);
       System.out.print("Tuliskan sekolah = ");
        try{
       sekolah=dataIn.readLine();
       }catch(IOException e ){
       System.out.print("error"); }

       System.out.println(sekolah);
       System.out.println("=============");
       System.out.println("Nama Saya = "+ name);
       System.out.println("Kelas = " + kelas);
       System.out.println("Sekolah = " +sekolah);










        }




   }





