package travel;
import java.util.*;

class Activity {
    String activityName;
    String description;
    double cost;
    int currentCapacity;
    Destination destination;
    int maxCapacity;
    
    Activity(String activityName, String description, double cost, int capacity, Destination destination){
        this.activityName = activityName;
        this.description = description;
        this.cost = cost;
        this.maxCapacity = capacity;
        this.currentCapacity = capacity;
        this.destination = destination;
        destination.addActivity(this);
    }

    void printActivity(){
        System.out.println("Name: " + this.activityName);
        System.out.println("Description: " + this.description);
        System.out.println("Cost: " + this.cost);
        System.out.println("Total capacity " + this.maxCapacity);
        System.out.println("Space left " + this.currentCapacity);
    }

    double getCost(){
        return cost;
    }

    void book(){
        currentCapacity--;
    }
    //Each activity is available at one destination only. Should I add destination?
}