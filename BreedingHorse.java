/*
 *  Kurt Kaiser
 *  CTIM 168 E40
 *  7.13.2018
 *
 */

import java.util.Objects;

public class BreedingHorse extends Horse
{
    private String mother;
    private String father;

    public BreedingHorse() {
        this.mother = "";
        this.father = "";
    }

    public BreedingHorse(String name, String color, int birthYear, String mother, String father) {
        super(name, color, birthYear);
        this.mother = mother;
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BreedingHorse that = (BreedingHorse) o;
        return Objects.equals(mother, that.mother) &&
                Objects.equals(father, that.father);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Mother: " + mother +
                ", Father: " + father;
    }
}
