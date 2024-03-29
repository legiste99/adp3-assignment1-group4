/**
 VenueFactory.java
 Factory for the Venue
 * Author: Thina Mbiza 217217095
 * Date 18 October 2022
 */

package ac.za.cput.factory.game;


import ac.za.cput.domain.game.Venue;
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
