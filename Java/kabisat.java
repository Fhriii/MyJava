  public class kabisat{
   public static void main(String[]args){
    int tahun =2025;
    if((tahun % 4 == 0) &&
    ((tahun % 100 != 0) || (tahun % 400 == 0)))
     System.out.println("Tahun " + tahun + " merupakan tahun kabisat.");
    else
    System.out.println(  "Tahun " + tahun + " bukan tahun kabisat.");


   }

  }