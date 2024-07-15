public class AttackCommand extends Command {
    private Character target;

    public AttackCommand(String name, String description, Character target) {
        super(name, description);
        this.target = target;
    }

    @Override
    public void execute(Game game) {
        Player player = game.getPlayer();
        // Example attack logic
        System.out.println("Attacking " + target.getName() + " with strength " + player.getStrength());
    }
}
