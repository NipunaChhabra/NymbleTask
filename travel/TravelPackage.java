package travel;
import java.util.*;

class TravelPackage {
    String packageName;
    int passengerCapacity;
    List<Destination> destinations;
    List<Passenger> passengers;

    TravelPackage(String name, int passengerCapacity){
        this.packageName = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<Destination>();
        this.passengers = new ArrayList<Passenger>();
    }
    
    boolean addDestination(Destination destination){
        if(!destinations.contains(destination)){
            this.destinations.add(destination);
            return true; 
        }
        // print or raise an Exception
        System.out.println("Destination already exists");
        return false;
    }

    // boolean removeDestination(Destination destination){
    //     if(destinations.contains(destination)){
    //         if(destination.activities.size()==0){
    //             destinations.remove(destination);
    //             return true;
    //         }
    //             System.out.println("remove activities");
    //             return false;
    //     }
    //     System.out.println("rDestination does not exist");
    //     return false;
    // }

    boolean addPassengers(Passenger P){
        if (passengerCapacity>0 && !passengers.contains(P)){
            this.passengers.add(P);
            this.passengerCapacity--;
            return true;
        }
        return false;
        
    }

    void printPackage(){
        System.out.println(packageName);
        for (Destination destination : destinations){
            System.out.println(destination.destinationName);
            System.out.println("Activities: ");
            for (Activity activity : destination.activities){
                System.out.println("Name: "+activity.activityName);
                System.out.println("Description: "+activity.description);
                System.out.println("Cost: "+activity.cost);
                System.out.println("Capacity: "+activity.maxCapacity);
            }
        }
    }

    void printPassengerList(){
        System.out.println("Name: "+packageName);
        System.out.println("Capacity: "+passengerCapacity);
        System.out.println("Number of Passenger Currently Enrolled: ");
        for(Passenger passenger : passengers){
            passenger.printPassenger();
        }
    }
}