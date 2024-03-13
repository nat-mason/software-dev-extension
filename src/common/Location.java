package common;

import java.util.Objects;

/** Represents a location on the map
 *
 */
public class Location {
    private int x;

    private int y;

    /**
     * Constructs a new location object with a given x and y coord
     * @param x the x coordinate
     * @param y the y coordinate
     */

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
    /**
     * returns the x coord of loaction
     * @return x coord of location
     */
    public int getX() {return x; }

    /**
     * returns the y coord of location
     * @return y coord of location
     */

    public int getY() {return y ;}

    /**
     * return whether target location = this location
     * @param obj The object to compare to
     * @return True if the given location is equal, else false
     */

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Location location = (Location) obj;
        return x == location.x && y == location.y;
    }

    /**
     * returns hash code of location
     * @return hash code of location
     */

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /**
     * returns string representation of this location
     * @return A string representation of this location
     */

    @Override
    public String toString(){
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /**
     * Parses the given string into a Location object.
     * @param s The string to parse, in the format "x,y"
     * @return The Location object parsed from the given string
     */

    public static Location parse(String s){
        String[] parts = s.split(",");
        return new Location(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    }
}
