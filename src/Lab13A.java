/*
Class: CSE 1321L
Section: J05
Term: Fall 2023
Instructor: Sathwik Chepyal
Name: Trinity Woods
Lab#: 13
*/
import java.text.DecimalFormat;
class BuildingBlueprint {
    // Variables (Attributes)
    private int numOfStories;
    private int numOfApartments;
    private float occupancyRate;
    private boolean fullyOccupied;

    // Default constructor
    public BuildingBlueprint() {
        this.numOfStories = 10;
        this.numOfApartments = 20;
        this.occupancyRate = 1.0f;
        this.fullyOccupied = true;
    }
    // Overloaded (Argument)
    public BuildingBlueprint(int stories, int apartments, float occupancy) {
        this.numOfStories = stories;
        this.numOfApartments = apartments;
        this.occupancyRate = occupancy;
        this.fullyOccupied = occupancy == 1.0f;
    }
    // Methods (Behavior)
    public int getNumOfStories() {
        return numOfStories;
    }
    public int getNumOfApartments() {
        return numOfApartments;
    }
    public float getOccupancyRate() {
        return occupancyRate;
    }
    public boolean isFullyOccupied() {
        return fullyOccupied;
    }
    public void setOccupancyRate(float occupancyRate) {
        this.occupancyRate = occupancyRate;
        this.fullyOccupied = occupancyRate == 1.0f;
    }
}
public class Lab13A {
    public static void main(String[] args) {
        // Create two building objects
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, 0.75f);

        // Return info about buildingOne and buildingTwo
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.getNumOfStories() + " floors, " + buildingOne.getNumOfApartments() + " apartments, and is " + (format.format(buildingOne.getOccupancyRate() * 100) + "% occupied. Full? " + buildingOne.isFullyOccupied()));
        System.out.println("Building 2 has " + buildingTwo.getNumOfStories() + " floors, " + buildingTwo.getNumOfApartments() + " apartments, and is " + (format.format(buildingTwo.getOccupancyRate() * 100) + "% occupied. Full? " + buildingTwo.isFullyOccupied()));

        // Use the Setter to change occupancy percentage
        buildingOne.setOccupancyRate(0.0f);
        buildingTwo.setOccupancyRate(1.0f);

        // Return updated info
        System.out.println("\nMany years pass.\n");
        System.out.println("Year 2043:");
        System.out.println("Building 1 has " + buildingOne.getNumOfStories() + " floors, " + buildingOne.getNumOfApartments() + " apartments, and is " + (format.format(buildingOne.getOccupancyRate() * 100) + "% occupied. Full? " + buildingOne.isFullyOccupied()));
        System.out.println("Building 2 has " + buildingTwo.getNumOfStories() + " floors, " + buildingTwo.getNumOfApartments() + " apartments, and is " + (format.format(buildingTwo.getOccupancyRate() * 100) + "% occupied. Full? " + buildingTwo.isFullyOccupied()));

        System.out.println("\nLooks like people prefer taller buildings.");
    }
}
