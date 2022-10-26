/**
 VenueFactory.java
 Factory for the Venue
 Author: Legiste Ndabashinze (217046207)
 Date: 31 March 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Venue;
import ac.za.cput.util.Helper;

public class VenueFactory {
    public static Venue newVenue(String vName, int capacity){
        String id = "vn-"+ Helper.generateId();

        return new Venue.Builder()
                .setId(id)
                .setVenueName(vName)
                .setCapacity(capacity)
                .build();
    }
}