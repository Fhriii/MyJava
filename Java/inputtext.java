import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class inputtext{
 public static void main(String[]args){
  BufferedReader dataIn = new BufferedReader
  (new InputStreamReader(System.in));
  String warna="";
  String warna2="";
  System.out.println("tulis warna kesukaan anda=");

  try{
  warna=dataIn.readLine();
  }catch(IOException e){
  System.out.println("error");
  }
    System.out.println("dan");

  System.out.println("tulis warna kesukaan anda ke-2=");
   try{
  warna2=dataIn.readLine();
  }catch(IOException e){
  System.out.println("error");
  }



   System.out.print("Warna kesukaan anda = " + warna );
   System.out.print(" dan " + warna2 );
  }
}