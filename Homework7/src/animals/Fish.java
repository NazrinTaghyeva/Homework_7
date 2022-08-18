package animals;
import abstracts.Foul;
import abstracts.Pet;
import main.AnimalSpecies;

public class Fish extends Pet implements Foul{
    public Fish(){
        super.setSpecies(AnimalSpecies.FISH);

    }
    public Fish( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(AnimalSpecies.FISH);
    }
    @Override
    public void foul() {
        System.out.println();
    }
}
