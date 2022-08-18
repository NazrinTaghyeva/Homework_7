package animals;
import main.*;
import abstracts.Foul;
import abstracts.Pet;
import main.AnimalSpecies;

public class RoboCat extends Pet implements Foul {
    public RoboCat(){
        super.setSpecies(AnimalSpecies.ROBOCAT);

    }
    public RoboCat( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(AnimalSpecies.ROBOCAT);
    }

    @Override
    public void foul() {
        System.out.println();
    }
}