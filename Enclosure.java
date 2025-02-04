import java.util.ArrayList;

public class Enclosure {
    private String name;
    private int area;
    private ArrayList<Animal> animals;

    // constructor
    public Enclosure(String name, int area, ArrayList<Animal> animals){
        this.name = name;
        this.area = area;
        this.animals = animals;
    }

    // setters and getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public int getArea(){
        return area;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    
    // methods
    public int countAnimal(){
        return animals.size();
    }
    
    public int getUtilisedArea() {
    	return 0;
    }
    
    public double getUtilisedAreaPercentage() {
    	return 0.0;
    }
    
    public int countSpecies(String species) {
    	return 0;
    }
    
    public boolean addAnimal(ArrayList<Animal> animal) {
    	return false;
    }
    
}