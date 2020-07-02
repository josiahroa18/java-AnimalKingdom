package animalkingdom;

abstract class AbstractAnimal {
    private static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearDiscovered;
    protected int food;

    public AbstractAnimal(){
        maxId++;
        this.id = maxId;
        this.name = "";
        this.yearDiscovered = 0;
        this.food = 0;
    }

    public AbstractAnimal(String name, int yearDiscovered){
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.food = 0;
    }

    public AbstractAnimal(String name, int yearDiscovered, int food){
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.food = food;
    }

    abstract String move();
    abstract String breathe();
    abstract String reproduce();

    void consumeFood(){
        food--;
    }

    int getYear(){
        return yearDiscovered;
    }

    String getName(){
        return name;
    }
}