package main;
import abstracts.Pet;
import java.util.Locale;
import persons.Man;
import persons.Woman;
public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet(AnimalSpecies.CAT,"Koukie",2,15,new String[]{"eating","sleeping"});
        Human mother = new Human("Nuray","Doe",1985);
        Human father = new Human("John","Doe",1980);

        Family mFamily = new Family(mother,father);
        Human child = new Human("Zuzu","Doe",2000,80,new String[][]{{Days.MONDAY.name().toLowerCase(Locale.ROOT),"watch the film"},{Days.THURSDAY.name().toLowerCase(Locale.ROOT),"meet the friends"}});
        Human child1 = new Human("Kate", "Parry", 2004, 80, new String[][]{{Days.THURSDAY.name().toLowerCase(Locale.ROOT),"watch the film"},{Days.FRIDAY.name().toLowerCase(Locale.ROOT),"meet the friends"}});


        System.out.println(pet);
        System.out.println(mother.getName());
        mFamily.addChild(child);
        mFamily.addChild(child1);
        System.out.println(mFamily.countFamily());
        mFamily.feed();
        mFamily.deleteChild(1);
        System.out.println(mFamily);
        System.out.println(mFamily.countFamily());
        Human.garbaceCollectorDeleting();
        System.out.println();

    }

}