package oppositedirection;

public class OppositeDirection {

    /**
     * Determines and returns the opposite direction.
     * Returns "up" if direction is "down", "down" if direction is "up",
     * "right" if direction is "left", "left" if direction is "right", "none" if
     * direction is anything else.
     * Return value is case sensitive.
     *
     * @param direction The direction to be evaluated.
     * @return String containing the opposite direction from the provided direction.
     */
    public String oppositeDirection(String direction) {
        if(direction=="up"){
            return "down";
        }
        else if(direction=="down"){
            return "up";
        }
        else if(direction=="left"){
            return "right";
        }
        else if(direction=="right"){
            return "left";
        }
        else{
            return "none";
        }
    }

}
