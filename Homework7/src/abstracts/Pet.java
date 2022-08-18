package abstracts;

import main.AnimalSpecies;

import java.util.Arrays;

public class Pet {
    private AnimalSpecies species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String nickName, int age, int trickLevel, String[] habits) {
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet (String nickName) {
        this.setSpecies(AnimalSpecies.UNKNOWN);
        this.setNickName(nickName);
    }

    public AnimalSpecies getSpecies() {
        return species;
    }

    public void setSpecies(AnimalSpecies species) {
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }



    public Pet() {

    }

    public Pet(AnimalSpecies species, String nickName, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(AnimalSpecies species, String nickName) {
        this.species = species;
        this.nickName = nickName;
    }

    public void eat() {
        System.out.println("I/'am eating...");
    }

    public void respond(String nickName) {
        System.out.println("Hello owner, " + nickName + " I miss you...");
    }

    public void foul() {
        System.out.println("I need to cover it up...");
    }

    public String toString() {
        return species + "{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
//   public void finalize()  {
//        System.out.println(nickName);
//    }


}