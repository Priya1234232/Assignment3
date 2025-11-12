import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StudentForm extends Application {
    @Override
    public void start(Stage stage) {
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label genderLabel = new Label("Gender:");
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        Label deptLabel = new Label("Department:");
        ComboBox<String> deptBox = new ComboBox<>();
        deptBox.getItems().addAll("CSE", "IT", "ECE", "EEE", "MECH");

        Button submit = new Button("Submit");
        TextArea output = new TextArea();
        output.setPrefHeight(100);

        submit.setOnAction(e -> {
            String name = nameField.getText();
            String gender = ((RadioButton) genderGroup.getSelectedToggle()).getText();
            String dept = deptBox.getValue();
            output.setText("Student Information:\nName: " + name + "\nGender: " + gender + "\nDepartment: " + dept);
        });

        VBox root = new VBox(10, nameLabel, nameField, genderLabel, male, female, deptLabel, deptBox, submit, output);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-alignment: center;");

        Scene scene = new Scene(root, 350, 400);
        stage.setTitle("Student Information Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
