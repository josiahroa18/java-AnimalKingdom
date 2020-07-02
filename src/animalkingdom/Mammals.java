package animalkingdom;

public class Mammals extends AbstractAnimal{
    public Mammals(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    public String move(){
        return "walk";
    }

    public String breathe(){
        return "lungs";
    }

    public String reproduce(){
        return "live births";
    }

    @Override
    public String toString(){
        return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + yearDiscovered + "}\n";
    }
}