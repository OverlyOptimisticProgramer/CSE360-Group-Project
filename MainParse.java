import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;

public class MainParse extends Application
{
    private InputPane inputPane;

    public void start(Stage stage)
    {
        StackPane root = new StackPane();

        inputPane = new InputPane();

        root.getChildren().add(inputPane);

        Scene scene = new Scene(root, 900, 500);
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}