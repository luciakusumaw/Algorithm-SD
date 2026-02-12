import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        String[][] dataNilai = {
            {"Pancasila", "", "", ""},
            {"Practicum Database", "", "", ""},
            {"Critical Thinking dan Problem Solving", "", "", ""},
            {"Basic Math", "", "", ""},
            {"Basic English", "", "", ""},
            {"Daspro", "", "", ""},
            {"Practicum Daspro", "", "", ""},
            {"Database", "", "", ""}
        };

        double totalBobot = 0;

        System.out.println("==============================");
        System.out.println("Program to Calculate GPA");
        System.out.println("==============================");

        //input nilai
        for (int i = 0; i < dataNilai.length; i++) {
            System.out.print("Input Score for " + dataNilai[i][0] + ": ");
            double inputNilai = sc.nextDouble();
            dataNilai[i][1] = String.valueOf(inputNilai);

            if (inputNilai > 80 && inputNilai <= 100) {
                dataNilai[i][2] = "A";  dataNilai[i][3] = "4.00";
            } else if (inputNilai > 73) {
                dataNilai[i][2] = "B+"; dataNilai[i][3] = "3.50";
            } else if (inputNilai > 65) {
                dataNilai[i][2] = "B";  dataNilai[i][3] = "3.00";
            } else if (inputNilai > 60) {
                dataNilai[i][2] = "C+"; dataNilai[i][3] = "2.50";
            } else if (inputNilai > 50) {
                dataNilai[i][2] = "C";  dataNilai[i][3] = "2.00";
            } else if (inputNilai > 39) {
                dataNilai[i][2] = "D";  dataNilai[i][3] = "1.00";
            } else {
                dataNilai[i][2] = "E";  dataNilai[i][3] = "0.00";
            }
            totalBobot += Double.parseDouble(dataNilai[i][3]);
        } 

        //tabel
        System.out.println("\n==============================");
        System.out.println("Grade Conversion");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "SCORE", "GRADE", "GPA");

        for (int i = 0; i < dataNilai.length; i++) {
            System.out.printf("%-40s %-15s %-15s %-15s\n", 
                dataNilai[i][0], dataNilai[i][1], dataNilai[i][2], dataNilai[i][3]);
        }

        double ip = totalBobot / dataNilai.length;
        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ip);

        sc.close();
    } 
}