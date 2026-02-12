import java.util.Scanner;

public class Selection13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PROGRAM TO CALCULATE FINAL SCORE");
        System.out.println("=================================");
        System.out.print("Input Assignment Score: ");
        double assignment = sc.nextDouble();
        System.out.print("Input Quiz Score: ");
        double quiz = sc.nextDouble();
        System.out.print("Input Mid Term Test Score: ");
        double midTerm = sc.nextDouble();
        System.out.print("Input Final Exam Score: ");
        double finalExam = sc.nextDouble();
        System.out.println("=================================");
        System.out.println("=================================");
        sc.close();
        //check the condition
        if (assignment>100 && assignment<0){
            System.out.println("Invalid Input");
            return;
        }if (quiz>100 || quiz<0){
            System.out.println("Invalid Input");
            return;
        }if (midTerm>100 || midTerm<0){
            System.out.println("Invalid Input");
            return;
        }if (finalExam>100 || finalExam<0){
            System.out.println("Invalid Input");
            return;
        }

        //calculate final score
        double finalScore = (0.2*assignment) + (0.2*quiz) + (0.3*midTerm) + (0.3*finalExam);

        //convert the score
        String letterScore = "";
        if (finalScore>80 && finalScore<=100) {
            letterScore = "A";
        } else if (finalScore<=80 && finalScore>73) {
            letterScore = "B+";
        } else if (finalScore<=73 && finalScore>65) {
            letterScore = "B";
        } else if (finalScore<=65 && finalScore>60) {
            letterScore = "C+";
        } else if (finalScore<=60 && finalScore>50) {
            letterScore = "C";
        } else if (finalScore<=50 && finalScore>39) {
            letterScore = "D";
        }else if (finalScore<=39) {
            letterScore = "E";
        }

        System.out.println("Your Final Score is: " + finalScore);
        System.out.println("Your Letter Score is: "+ letterScore);
        System.out.println("=================================");
        System.out.println("=================================");

        //check if the student pass or not
        if (finalScore<=50) {
            System.out.println("NOT PASS");
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}