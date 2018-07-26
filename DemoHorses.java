/*
 *  Kurt Kaiser
 *  CTIM 168 E40
 *  7.13.2018
 *
 */

import java.util.Scanner;

public class DemoHorses {

    public static void main(String[] args) {

        String name;
        String color;
        int birthYear;
        int races;
        int wins;
        String mother;
        String father;
        int count = 1;

        Horse [] horseArray = new Horse[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("--- Horse " + count + " ---");
            // Name
            System.out.println("Enter the horse's name.");
            Scanner scan = new Scanner(System.in);
            name = scan.nextLine();
            // Color
            System.out.println("Enter the color of " + name + ".");
            scan = new Scanner(System.in);
            color = scan.nextLine();
            // Birth year
            System.out.println("Enter " + name + "'s birth year.");
            scan = new Scanner(System.in);
            birthYear = scan.nextInt();
            if (i < 3) {
                // Races
                System.out.println("Enter the number of races.");
                scan = new Scanner(System.in);
                races = scan.nextInt();
                System.out.println("Enter the number of wins.");
                scan = new Scanner(System.in);
                wins = scan.nextInt();
                horseArray[i] = new RaceHorse(name, color, birthYear, races, wins);
                // Cast to access the setRaces method
                ((RaceHorse)horseArray[i]).setRaces(races);
            } else {
                System.out.println("Enter the " + name + "'s mother's name.");
                scan = new Scanner(System.in);
                mother = scan.nextLine();
                // Color
                System.out.println("Enter the " + name + "'s father's name.");
                scan = new Scanner(System.in);
                father = scan.nextLine();
                horseArray[i] = new BreedingHorse(name, color, birthYear, mother, father);
            }
            horseArray[i].setBirthYear(birthYear);
            count ++;
        }

        // Output data entered
        count = 1;
        System.out.println("\n Data Entered");
        for (int n = 0; n < 6; n++){
            System.out.println("Horse " + count + "\n" + horseArray[n].toString());
            count ++;
        }

    }
}

