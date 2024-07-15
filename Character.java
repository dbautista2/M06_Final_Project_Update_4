import java.util.*;

public class Character {
    private String name;
    private String description;
    private List<String> dialogue;
    private List<Item> inventory;
    private Location location;
    private int health;
    private int strength;
    private boolean isHostile;

    public Character(String name, String description) {
        this.name = name;
        this.description = description;
        this.dialogue = new ArrayList<>();
        this.inventory = new ArrayList<>();
        this.health = 100;
        this.strength = 10;
        this.isHostile = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getDialogue() {
        return dialogue;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public boolean isHostile() {
        return isHostile;
    }
}
