/*
 *  Kurt Kaiser
 *  CTIM 168 E40
 *  7.13.2018
 *
 */

import java.util.Objects;
import java.util.Scanner;

public class Horse
{
    //instance variables
    private String name;
    private String color;
    private int birthYear;

    public Horse() {
        this.name = "";
        this.color = "";
        this.birthYear = 0;
    }

    public Horse(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void testing(int num){
        System.out.println(!(num > 1 && num < 5));
    }

    public void setBirthYear(int birthYear) {
        while(birthYear < 1988 || birthYear > 2018) {
            System.out.println("Year must be after 1988 and before 2018.");
            Scanner scan = new Scanner(System.in);
            birthYear = scan.nextInt();
        }
        this.birthYear = birthYear;
    }

    public String toString() {
        return  "Name: " + name +
                ", Color: " + color +
                ", Birth year: " + birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return birthYear == horse.birthYear &&
                Objects.equals(name, horse.name) &&
                Objects.equals(color, horse.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, color, birthYear);
    }
}
