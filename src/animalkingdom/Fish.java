package animalkingdom;

public class Fish extends AbstractAnimal{
    public Fish(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    public String move(){
        return "swim";
    }

    public String breathe(){
        return "gills";
    }

    public String reproduce(){
        return "eggs";
    }

    @Override
    public String toString(){
        return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + yearDiscovered + "}\n";
    }
}