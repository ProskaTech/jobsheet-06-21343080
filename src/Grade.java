/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

public class Grade {
    public static void main (String[] args){
        double grade = 92.0;

        if(grade >= 90) {
            System.out.println("Excellent!");
        }
        /*Untuk menentukan kondisi yang mempunyai nilai rentangan maka tentukan nilai batas atas dan batas bawah setelah itu digabungkan dengan logika AND (&&) */
        else if((grade < 90) && (grade >= 80)){
            System.out.println("Good Job!");
        }else if((grade < 80) && (grade >= 60)){
            System.out.println("Study Harder!");
        }else {
            System.out.println("Sorry, you failed");
        }
    }
}
