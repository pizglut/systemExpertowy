import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class startAplication {

     int points = 100;
    Scanner scanner = new Scanner(System.in);
    public void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Witaj w asystencie wyboru");

        // wywołanie pytań
//        pytanie1();
        pytanie2();
//        pytanie3();
//        pytanie4();
//        pytanie5();
//        pytanie6();
//        pytanie7();
//        pytanie8();
//        pytanie9();
//        pytanie10();
//        pytanie11();
//        pytanie12();
//        pytanie13();
//        wynik();
    }
//    public void pytanie1() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 1 of 13:\n" +
//                "Towar podany w kg/l\n" +
//                "kg\n" +
//                "l\n");
//        switch (answer){
//            case "kg", "l" -> points
//        }
//    }

    public void pytanie2(){
        String odp;
        System.out.println("\n Towar powyrzej 500 jednostek (wybierz 1 lub 2) \n 1 = tak \n 2 = nie");
        odp = scanner.next();
        switch (odp){
            case 1:
                points =(points + 100);
            break;
            case 2:
                points =(points + 1);
            break;
            default:
                System.out.println("\n niewłaściwa odpowiedź");
        }
    }
//    public static void pytanie2() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 2 of 13:\n" +
//                "Towar powyrzej 500 jednostek\n" +
//                "tak\n" +
//                "nie\n");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie3() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 3 of 13:\n" +
//                "Powierzchnia powyrzej 15m3\n" +
//                "tak\n" +
//                "nie\n");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie4() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 4 of 13:\n" +
//                "Dystans docelowy powyrzej 100km\n" +
//                "tak\n" +
//                "nie\n");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie5() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 5 of 13:\n" +
//                "Czy połączenie lądowe jest niemożliwe\n" +
//                "tak\n" +
//                "nie\n");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie6() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 6 of 13:\n" +
//                "Czy występuje potrzeba utrzymywania stałej temperatury?\n" +
//                "tak\n" +
//                "nie\n");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie7() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 7 of 13:\n" +
//                "Czy towar jest sypki?\n" +
//                "tak\n" +
//                "nie\n");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie8() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 1 of 15:\n" +
//                "Czy towar jest legalny?\n" +
//                "tak\n" +
//                "nie\n");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie9() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 1 of 15:\n" +
//                "Czas przejazdu powyżej jednego dnia\n" +
//                "tak\n" +
//                "nie\n");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie10() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 1 of 15:\n" +
//                "What is a correct syntax to output \"Hello World\" in Java?\n" +
//                "D. print(\"Hello World\")");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie11() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 1 of 15:\n" +
//                "What is a correct syntax to output \"Hello World\" in Java?\n" +
//                "D. print(\"Hello World\")");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie12() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 1 of 15:\n" +
//                "What is a correct syntax to output \"Hello World\" in Java?\n" +
//                "D. print(\"Hello World\")");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void pytanie13() {
//        String answer = JOptionPane.showInputDialog(null, "Pytanie 1 of 15:\n" +
//                "What is a correct syntax to output \"Hello World\" in Java?\n" +
//                "D. print(\"Hello World\")");
//        switch (answer){
//            case "C", "c" -> points++;
//        }
//    }
//
//    public static void wynik() {
//        String name = JOptionPane.showInputDialog(null,"You finished the quiz.\nPlease enter your name?");
//        if (points == 15)
//        {
//            JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Score: " + points + "\nGood job!");
//        }else if(points >= 10) {
//            JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Score: " + points + "\nYou Passed the quiz.");
//        }else{
//            JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Score: " + points + "\nYou can still study more for the next quiz.");
//        }
//    }
}
