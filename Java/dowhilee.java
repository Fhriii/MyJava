public class dowhilee{
 public static void main(String[]args){
  int n=1;
  int hasil=1;
  int i=5;

  System.out.print(i +"! = ") ;
  do{
    System.out.print(i);
    if (i !=n){
     System.out.print(" x ") ;
    }
    else {
     System.out.print(" = " );


    }
    hasil *= i;
    i--;


  }
  while (i >=n );
  System.out.println(hasil);

 }
}