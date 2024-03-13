package pathFinding;
import common.*;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * represent a path on the map
 */
public class Path implements Iterable<Location>{
    private List<Location> inner;

    /**
     * Construct new path using arraylist of locations
     * @param inner the path
     */
    public Path(List<Location> inner){
        this.inner = inner;
    }

    /**
     *
     */
    public boolean isLocationPath(int x, int y){
        return inner.contains(new Location(x, y));
    }
}
