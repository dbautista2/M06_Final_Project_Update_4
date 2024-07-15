public class Item {
    private String name;
    private String description;
    private double weight;
    private int value;
    private String effect;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
        this.weight = 0;
        this.value = 0;
        this.effect = "";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public String getEffect() {
        return effect;
    }
}
