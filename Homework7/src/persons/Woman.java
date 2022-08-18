package persons;

import main.Family;
import main.Human;

public final class Woman extends Human {
    public void makeUp(){
        System.out.println("Nazrin don't like makeUp");

    }
    public void greetPet(){
        System.out.println("Hi." + super.getName());
    }
    public Woman (){

    }
    public Woman(String name, String surname, int year, int iq, String[][] schedule, Family family){
        super(name,surname,year,iq,schedule,family);
    }
    public Woman(String name, String surname, int year){
        super(name,surname,year);
    }


}
