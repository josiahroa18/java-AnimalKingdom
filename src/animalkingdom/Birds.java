package animalkingdom;

public class Birds extends AbstractAnimal{
    public Birds(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    public String move(){
        return "fly";
    }

    public String breathe(){
        return "lungs";
    }

    public String reproduce(){
        return "eggs";
    }

    @Override
    public String toString(){
        return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + yearDiscovered + "}\n";
    }
}