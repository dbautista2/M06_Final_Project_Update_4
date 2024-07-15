public class MoveCommand extends Command {
    private Location destination;

    public MoveCommand(String name, String description, Location destination) {
        super(name, description);
        this.destination = destination;
    }

    @Override
    public void execute(Game game) {
        Player player = game.getPlayer();
        player.setCurrentLocation(destination);
        System.out.println("Moved to " + destination.getName());
    }
}
