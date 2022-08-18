package persons;
import main.Family;
import main.Human;

public final class Man extends Human {
    public void repairCar(){
        System.out.println("Ferrari");
    }
    public void greetPet() {
        System.out.println("Hii" + super.getName());
    }

    public Man (){

    }
    public Man(String name, String surname, int year, int iq, String[][] schedule, Family family){
        super(name,surname,year,iq,schedule,family);
    }
    public Man(String name, String surname, int year){
        super(name,surname,year);
    }

}