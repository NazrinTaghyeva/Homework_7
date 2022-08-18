package animals;
import main.*;
import abstracts.Foul;
import abstracts.Pet;
import main.AnimalSpecies;


public class DomesticCat extends Pet implements Foul {
    public DomesticCat(){
        super.setSpecies(AnimalSpecies.DOMESTICCAT);

    }
    public DomesticCat( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(AnimalSpecies.DOMESTICCAT);
    }


    @Override
    public void foul() {
        System.out.println();
    }

}
