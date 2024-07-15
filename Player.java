import java.util.*;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int dexterity;
    private int intelligence;
    private List<Item> inventory;
    private Location currentLocation;
    private int experience;
    private int level;
    private int gold;
    private List<String> statusEffects;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.strength = 10;
        this.dexterity = 10;
        this.intelligence = 10;
        this.inventory = new ArrayList<>();
        this.experience = 0;
        this.level = 1;
        this.gold = 0;
        this.statusEffects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location location) {
        this.currentLocation = location;
    }
}
