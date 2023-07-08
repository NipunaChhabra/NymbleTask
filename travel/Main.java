package travel;
import java.util.List;

public class Main {

    void buildPackage(){

    }
    public static void main(String[] args) {
        // Building Package
        TravelPackage Kodachadri = new TravelPackage("Kodachadri", 10);

        Destination nagaraFort = new Destination("Nagara Fort");
        Kodachadri.addDestination(nagaraFort);

        Destination hinndlumaneFalls = new Destination("HinndlumaneFalls");
        Kodachadri.addDestination(hinndlumaneFalls);

        Destination devagange = new Destination("devangange");
        Kodachadri.addDestination(devagange);
        
        Destination malgudiMuseum = new Destination("malgudiMuseum");
        Kodachadri.addDestination(malgudiMuseum);

        Activity BungeeJumping = new Activity("bungee jumping", "funnn", 1000, 10, nagaraFort);
        Activity kayak = new Activity("kayak", "funnn", 500, 10, devagange);
        

        System.out.println("1. Printing package");
        Kodachadri.printPackage();

        System.out.println("2. Printing Passenger List");
        Kodachadri.printPassengerList();

        Passenger Nipuna = new Passenger("Nipuna", 1, passengerCategory.PREMIUM, 0);
        Nipuna.signUp(BungeeJumping);
        Nipuna.signUp(kayak);

        System.out.println("3. Printing details of Nipuna Passenger");
        Nipuna.printPassenger();

        System.out.println("4. Print the details of all the activities that still have spaces available, including how many spaces are available.");
        for(Destination destination : Kodachadri.destinations){
            for(Activity a : destination.activities){
                if(a.currentCapacity>0){
                    a.printActivity();
                }
            }
        } 
        

        // details of all activities that still ahve space, including how many spaces available.
    }
}