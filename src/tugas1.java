/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tugas1 {

    public static void main(String[] args) {
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        String x = "";
        String y = "";
        String z = "";

        try {
            System.out.print("Masukkan nilai 1: ");
            x = nilai.readLine();
            System.out.print("Masukkan nilai 2: ");
            y = nilai.readLine();
            System.out.print("Masukkan nilai 3: ");
            z = nilai.readLine();
        } 
        
        catch (IOException e) {
            System.out.println("Gagal membaca keyboard");
        }

        int pertama;
        int kedua;
        int ketiga;

        pertama = Integer.parseInt(x);
        kedua = Integer.parseInt(y);
        ketiga = Integer.parseInt(z);
        int rata_rata = (pertama + kedua + ketiga) / 3;

        System.out.println("Rata-rata nilai Anda: " + rata_rata);
        if (rata_rata >= 60) {
            System.out.println(":-) ");
        } else {
            System.out.println(":-(");
        }

    }
}
