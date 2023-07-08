package travel;
import java.util.*;

class Destination{

    String destinationName;
    List<Activity> activities;

    Destination(String name){
        this.destinationName = name;
        this.activities = new ArrayList<Activity>();
    }

    boolean addActivity(Activity activity){
        if(!this.activities.contains(activity)){
            this.activities.add(activity);
            return true;
        }
        return false;
    }
}