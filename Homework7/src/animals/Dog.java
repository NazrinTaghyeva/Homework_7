package animals;
import abstracts.Foul;
import abstracts.Pet;
import main.AnimalSpecies;


public class Dog extends Pet implements Foul {
    public Dog (){
        super.setSpecies(AnimalSpecies.DOG);

    }
    public Dog( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(AnimalSpecies.DOG);
    }

    @Override
    public void foul() {
        System.out.println();
    }
}