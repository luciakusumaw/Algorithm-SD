import java.util.Scanner;

public class Schedule {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //input number of schedules
        System.out.print("Enter the number of lecture schedules (n): ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] schedule = new String[n][4];
        //call the functions
        inputData(schedule);
        displayAll(schedule);
        searchByDay(schedule);
        searchByCourse(schedule);
    }

    //to input the data
    public static void inputData(String[][] schedule) {
        System.out.println("\n--- INPUT DATA ---");
        for (int i = 0; i < schedule.length; i++) {
            System.out.println("Schedule index [" + i + "]");
            System.out.print("Course Name   : ");
            schedule[i][0] = sc.nextLine();
            System.out.print("Room          : ");
            schedule[i][1] = sc.nextLine();
            System.out.print("Lecture Day   : ");
            schedule[i][2] = sc.nextLine();
            System.out.print("Lecture Hours : ");
            schedule[i][3] = sc.nextLine();
            System.out.println();
        }
    }

    //to display table
    public static void displayAll(String[][] schedule) {
        System.out.println("\n--- ENTIRE LECTURE SCHEDULE ---");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-20s | %-15s | %-10s | %-10s\n", "Course", "Room", "Day", "Hours");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < schedule.length; i++) {
            System.out.printf("%-20s | %-15s | %-10s | %-10s\n", 
                schedule[i][0], schedule[i][1], schedule[i][2], schedule[i][3]);
        }
        System.out.println("-------------------------------------------------------------------");
    }

    //display by day
    public static void searchByDay(String[][] schedule) {
        System.out.print("\nEnter the day you want to see: ");
        String targetDay = sc.nextLine();
        System.out.println("Results for " + targetDay + ":");
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][2].equalsIgnoreCase(targetDay)) {
                System.out.println("- " + schedule[i][0] + " (" + schedule[i][3] + ") in " + schedule[i][1]);
            }
        }
    }

    //display by course name
    public static void searchByCourse(String[][] schedule) {
        System.out.print("\nEnter the course name you want to search: ");
        String targetCourse = sc.nextLine();
        System.out.println("Search Details:");
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][0].equalsIgnoreCase(targetCourse)) {
                System.out.println("Room  : " + schedule[i][1]);
                System.out.println("Day   : " + schedule[i][2]);
                System.out.println("Hours : " + schedule[i][3]);
            }
        }
    }
}