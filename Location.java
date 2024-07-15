import java.util.*;

public class Location {
    private String name;
    private String description;
    private List<Item> items;
    private List<Character> characters;
    private Map<String, Location> connectedLocations;
    private boolean isVisited;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
        this.characters = new ArrayList<>();
        this.connectedLocations = new HashMap<>();
        this.isVisited = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public Map<String, Location> getConnectedLocations() {
        return connectedLocations;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        this.isVisited = visited;
    }
}
