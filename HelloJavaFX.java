import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        Label msg = new Label("Hello, JavaFX!");
        Label javaLabel = new Label("Java Version: " + javaVersion);
        Label fxLabel = new Label("JavaFX Version: " + javafxVersion);

        VBox root = new VBox(10, msg, javaLabel, fxLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("JavaFX Version Info");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
