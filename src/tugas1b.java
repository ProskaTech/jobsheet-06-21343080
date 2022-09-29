/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

import javax.swing.JOptionPane;
public class tugas1b {

    public static void main(String[] args) {
    int angka1;
    int angka2;
    int angka3;

 
    angka1= Integer.parseInt (JOptionPane.showInputDialog("masukan angka1:"));
    angka2= Integer.parseInt(JOptionPane.showInputDialog("masukan angka2:"));
    angka3= Integer.parseInt(JOptionPane.showInputDialog("masukan angka3:"));
    double hasil=(angka1+angka2+angka3)/3;
    
  
     if(hasil>=60)
     {
         JOptionPane.showMessageDialog(null,"Rata-Rata Anda Adalah = \n"+ hasil +" :-)");
     }
     else
        {
            JOptionPane.showMessageDialog(null,"Rata-Rata Anda Adalah = \n"+ hasil +" :-)");
            
            
        }
    }
}
