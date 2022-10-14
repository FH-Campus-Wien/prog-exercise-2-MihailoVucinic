package at.ac.fhcampuswien;

import com.sun.tools.javac.util.JCDiagnostic;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        int count = 1;
        double largest;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number " + count++ + ": ");
        double number = largest = sc.nextDouble();


        if (number <= 0) {
            System.out.println("No number entered.");
        } else {
            while (number > 0) {
                System.out.print("Number " + count++ + ": ");
                number = sc.nextDouble();
                if (largest < number) {
                    largest = number;
                }
            }
            System.out.printf("The largest number is %.2f" + System.lineSeparator(), largest);
        }
    }
    // input your solution here


    //todo Task 2
    public void stairs() {
        Scanner sc = new Scanner(System.in);

        System.out.print("n: ");
        int number = sc.nextInt();
        int variable = 1;

        if (number >= 0) {
            for (int row = 0; row < number; row++) {
                for (int col = number; col >= number - row; col--) {
                    System.out.print(variable + " ");
                    variable++;
                }
                System.out.println();
            }
        } else
            System.out.println("Invalid number!");
        // input your solution here
    }


    //todo Task 3
    public void printPyramid() {
        int star = 6;

        for (int row = 1; row <= star; row++){
            for (int col = star; col > row; col--){
                System.out.print(" ");
            }
            for (int col = 0; col < row*2-1; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // input your solution here
}

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks() {
        Scanner sc = new Scanner (System.in);

        int count = 1;
        int Note = 0;
        int Durch = 0;
        int negNote = 0;

        do {
            if (Note > 5 || Note < 0) {
                System.out.println("Invalid mark!");
            }
            System.out.print("Mark " + count  + ": ");
            Note = sc.nextInt();
            if (Note == 0 && count > 1){
                count = count-1;
            }
            if (Note <=5 && Note > 0) {
                count++;
                 Durch= Durch + Note;
            }
            if (Note == 5) {
                negNote ++;
            }


        } while (Note != 0);

        float average = (float) Durch/ (count) ;

        if (Durch <= 0) {
            System.out.println("Average: 0,00");
        } else {
            System.out.printf("Average: %.2f" + System.lineSeparator(), average);
        }
        System.out.println("Negative marks: "+ negNote);
        // input your solution here
    }

        // input your solution here


    //todo Task 6
    public void happyNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.print("n: ");
        int num = sc.nextInt();
        int rem = 0;
        int sum = 0;

        while (num != 1) {
            sum = 0;
            while (num != 0) {
                rem = num % 10;
                sum = sum + (rem * rem);
                num = num / 10;
            }
            num = sum;

            if (num == 4) {
                System.out.println("Sad number!");
            }
        }
        System.out.println("Happy number!");


        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}