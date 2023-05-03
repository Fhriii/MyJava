import javax.swing.JOptionPane;
public class inputForm{
    public static void main(String[]args){
        String warna1="";
        String warna2="";
        String warna3="";
        warna1=JOptionPane.showInputDialog("Tulis warna: ");
        String pesan=( "warna kesukaanku " +warna1  );


        warna2=JOptionPane.showInputDialog("Tulis warna ke-2 : ");
        String pesan2=(" dan "+ warna2 );


       // sekolah=JOptionPane.showInputDialog("Tulis sekolah anda : ");
//        String pesan3=(sekolah + "   ");



         JOptionPane.showMessageDialog(null,pesan  + pesan2  );


    }




}