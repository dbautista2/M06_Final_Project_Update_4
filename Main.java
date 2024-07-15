import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create the game instance
        Game game = new Game();

        // Create JavaFX UI components
        Button startButton = new Button("Start Game");
        startButton.setOnAction(e -> {
            game.start();
            System.out.println("Game started!");
        });

        Button moveButton = new Button("Move");
        moveButton.setOnAction(e -> {
            // Example usage of MoveCommand
            Location newLocation = new Location("Forest", "A dark and eerie forest.");
            Command moveCommand = new MoveCommand("Move", "Move to a new location", newLocation);
            game.addCommand("move", moveCommand);
            game.executeCommand("move");
        });

        VBox vbox = new VBox(startButton, moveButton);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setTitle("Text-Based Adventure Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
