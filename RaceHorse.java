/*
 *  Kurt Kaiser
 *  CTIM 168 E40
 *  7.13.2018
 *
 */

import java.util.Objects;
import java.util.Scanner;

public class RaceHorse extends Horse
{
    private int races;
    private int wins;

    // Constructors
    public RaceHorse() {
        this.races = 0;
        this.wins = 0;
    }

    public RaceHorse(String name, String color, int birthYear, int races, int wins) {
        super(name, color, birthYear);
        this.races = races;
        this.wins = wins;
    }

    public int getRaces() {
        return races;
    }

    public void setRaces(int races) {
        while (races < 0 || races < wins){
            System.out.println("Races must be greater than 0 and greater than the number of wins.");
            Scanner scan = new Scanner(System.in);
            races = scan.nextInt();
        }
        this.races = races;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Races: " + races +
                ", Wins: " + wins;
    }
}
