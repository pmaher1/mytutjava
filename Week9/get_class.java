package getclass;

import java.util.ArrayList;
import java.util.List;

//WORK IN PROGRESS

public class Port {

    /**
     * Return a list of all ships where the class type matches that of the
     * referenceType parameter
     * For example, if there is a list with 2 CargoShip, 3 PassengerFerry,
     * and 1 PaddleSteamer and referenceType parameter is a PassengerFerry,
     * then the 3 PassengerFerry objects must be returned in a list.
     * If none of the ships in the list have a matching class type, return
     * an empty (but initalised) ArrayList that holds Ship objects is returned.
     * @param ships a List of Ship objects
     * @param referenceType a Ship object
     * @return list of all Ship objects which have a class type which
     *         matches the referenceType
     */
    public List<Ship> getShipsWhichMatchType(ArrayList<Ship> ships, Ship referenceType) {
        // add implementation
        List<Ship> newShips = new ArrayList<Ship>();
        String convertedToString = String.valueOf(referenceType);
        for (int i=0; i< ships.size(); i++){
            if (ships.get(i).getClass().equals(referenceType)){
                newShips.add(ships.get(i));
            }
            else {
                //newShips.add(ships.get(i));
            }
        }
        return newShips;
    }

}
