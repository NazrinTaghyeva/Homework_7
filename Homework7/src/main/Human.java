package main;
import abstracts.Pet;

import java.util.Arrays;

public class Human {

    private String name;
    private String surName;
    private int year;
    private int iq;
    private Pet pet;
    private Human father;
    private Human mother;
    private String[][] schedule;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    private Family family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Human(String name, String surName, int year, int iq, String[][] schedule, Family family) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human() {
    }

    public Human(String name, String surName, int year) {
        this.name = name;
        this.surName = surName;
        this.year = year;
    }

    public Human(String name, String surName, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surName, int year, Human father, Human mother) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surName, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;

    }

    public void greetPet() {
        System.out.println("Hello " + pet.getNickName());
    }

    public void describePet() {
        String sly = " ";
        if (pet.getTrickLevel() > 50) {
            sly = "very sly";
        } else {
            sly = "almost not sly";
        }
    }


    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surName + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", scheduler=" + Arrays.deepToString(schedule) +
                '}';
    }

    //    public void finalize()  {
//        System.out.println(name + surName);
//    }
    public static void garbaceCollectorDeleting() {
        for (int i = 0; i < 1000000; i++) {
            Human human = new Human();
        }

    }

}