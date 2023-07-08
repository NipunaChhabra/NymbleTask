package travel;
import java.util.*; 

enum passengerCategory{
    STANDARD,
    GOLD,
    PREMIUM
}

class Passenger{
    String name;
    int passengerNumber;
    List<Activity> activities;
    passengerCategory p;
    private int balance;

    Passenger(String Name, int id, passengerCategory p, int openingBalance){
        this.name = Name;
        this.passengerNumber = id;
        this.p = p;
        this.balance = openingBalance;
        this.activities = new ArrayList<Activity>();
    }

    void printPassenger(){
        System.out.println("Name: " + this.name);
        System.out.println("Number: " + this.passengerNumber);
        System.out.println("Balance: " + this.balance);
        for (Activity act : activities){
                System.out.println(act.destination);
                System.out.println(act.activityName);
                System.out.println(act.cost);
            }
        System.out.println("Number: " + this.passengerNumber);
    }

    int getBalance(){
        return balance;
    }

    void addBalance(int amt){
        balance += amt;
    }

    boolean signUp(Activity a){
        if (this.p == passengerCategory.STANDARD){
            if(a.getCost()<this.balance){
            a.book();
            balance-=a.getCost();
            activities.add(a);
            return true;
            }
        }

        else if (this.p == passengerCategory.GOLD){
            double costAfterDiscount = 0.9*a.getCost();
            if(costAfterDiscount<this.balance){
            a.book();
            balance-=costAfterDiscount;
            activities.add(a);
            return true;
            }
        }

        
        else if(this.p ==  passengerCategory.PREMIUM){
            a.book();
            activities.add(a);
            return true;
        }
        return false;
        
    }
}
