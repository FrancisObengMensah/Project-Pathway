/*Name: Francis Obeng-Mensah
 * School: University of Maryland Baltimore County
 * Class: IS147
 * Problem 2
 * The second program defines a class Athlete with attributes athleteName, athleteSport, and athleteAge, 
 * along with corresponding getter methods and a constructor. 
 * It includes a method ageAtGraduation that calculates the athlete's age when they graduate based on a given number of years. 
 * In the AthleteDetails class, the program prompts the user to input details for two athletes and creates two Athlete objects 
 * using these details. It then prints each athlete's details, including their age at graduation 
 * (4 years for the first athlete and 2 years for the second). 
 * This program demonstrates object-oriented principles such as class definition, encapsulation, and method usage in Java.
*/
 



import java.util.Scanner;

class Athlete {
    private String athleteName;
    private String athleteSport;
    private int athleteAge;

    //  The All-Args Constructor
    public Athlete(String athleteName, String athleteSport, int athleteAge) {
        this.athleteName = athleteName;
        this.athleteSport = athleteSport;
        this.athleteAge = athleteAge;
    }

    // The Getters
    public String getAthleteName() {
        return athleteName;
    }

    public String getAthleteSport() {
        return athleteSport;
    }

    public int getAthleteAge() {
        return athleteAge;
    }

    // Method to calculate age at graduation
    public int ageAtGraduation(int yearsToGraduate) {
        return athleteAge + yearsToGraduate;
    }
}

public class AthleteDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for the first athlete
        System.out.println("Enter details for Athlete 1:");
        System.out.print("Name: ");
        String name1 = scanner.next();
        System.out.print("Sport: ");
        String sport1 = scanner.next();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();

        // Inputs the details for the second athlete
        System.out.println("Enter details for Athlete 2:");
        System.out.print("Name: ");
        String name2 = scanner.next();
        System.out.print("Sport: ");
        String sport2 = scanner.next();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();

        // Creates the Athlete objects
        Athlete athlete1 = new Athlete(name1, sport1, age1);
        Athlete athlete2 = new Athlete(name2, sport2, age2);

        // Prints the details of the first athlete
        System.out.println("\nDetails of Athlete 1:");
        System.out.println("Name: " + athlete1.getAthleteName());
        System.out.println("Sport: " + athlete1.getAthleteSport());
        System.out.println("Age: " + athlete1.getAthleteAge());
        System.out.println("Age at Graduation (in 4 years): " + athlete1.ageAtGraduation(4));

        // Prints the  details of the second athlete
        System.out.println("\nDetails of Athlete 2:");
        System.out.println("Name: " + athlete2.getAthleteName());
        System.out.println("Sport: " + athlete2.getAthleteSport());
        System.out.println("Age: " + athlete2.getAthleteAge());
        System.out.println("Age at Graduation (in 2 years): " + athlete2.ageAtGraduation(2));

        scanner.close();
    }
}