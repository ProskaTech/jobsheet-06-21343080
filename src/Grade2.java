/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

public class Grade2 {
    public static void main (String[]args){
        int grade = 92;
        
        switch (grade) {
            case 100:
                System.out.println("Excellent!");
                break;
            case 90:
                System.out.println("Good Job!");
                break;
            case 80:
                System.out.println("Study harder!");
                break;
            default:
                System.out.println("Sorry, you failed");
        }
    }
}
