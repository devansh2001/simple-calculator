import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author dponda3
 * Example for Basic JavaFX for Recitation on 04/02/2019
 */

public class MyCalculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create labels, text fields, and buttons
        Label number_1_label = new Label("Operand 1: ");
        Label number_2_label = new Label("Operand 2: ");
        Label result_label = new Label("Result: ");
        TextField number_1 = new TextField();
        TextField number_2 = new TextField();
        TextField result = new TextField();
        Button add = new Button("+");
        Button subtract = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");
        Button modulus = new Button("%");

        // Create containers to put different labels, text fields and buttons in
        HBox number_1_box = new HBox();
        number_1_box.getChildren().addAll(number_1_label, number_1);
        HBox number_2_box = new HBox();
        number_2_box.getChildren().addAll(number_2_label, number_2);
        HBox result_box = new HBox();
        result_box.getChildren().addAll(result_label, result);
        HBox operator_box = new HBox();
        operator_box.getChildren().addAll(add, subtract, multiply, divide,
                modulus);
        VBox container = new VBox();
        container.getChildren().addAll(number_1_box, number_2_box, operator_box,
                result_box);

        // Beautification Work -- Ignore
        number_1_box.setSpacing(20);
        number_2_box.setSpacing(20);
        result_box.setSpacing(20);
        operator_box.setSpacing(20);
        container.setSpacing(20);
        container.setPadding(new Insets(30));

        // Code to make the buttons work
        // Using Anonymous Inner Classes
        add.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                double num1 = Double.parseDouble(number_1.getText());
                double num2 = Double.parseDouble(number_2.getText());
                double answer = num1 + num2;
                result.setText(answer + "");
            }
        });

        // Using Lambda Expressions
        subtract.setOnAction(e -> {
            double num1 = Double.parseDouble(number_1.getText());
            double num2 = Double.parseDouble(number_2.getText());
            double answer = num1 - num2;
            result.setText(answer + "");
        });

        multiply.setOnAction(e -> {
            double num1 = Double.parseDouble(number_1.getText());
            double num2 = Double.parseDouble(number_2.getText());
            double answer = num1 * num2;
            result.setText(answer + "");
        });

        divide.setOnAction(e -> {
            double num1 = Double.parseDouble(number_1.getText());
            double num2 = Double.parseDouble(number_2.getText());
            if (num2 == 0) {
                result.setText("2nd operand Can't be 0");
            } else {
                double answer = num1 / num2;
                result.setText(answer + "");
            }

        });

        modulus.setOnAction(e -> {
            double num1 = Double.parseDouble(number_1.getText());
            double num2 = Double.parseDouble(number_2.getText());
            if (num2 == 0) {
                result.setText("2nd operand Can't be 0");
            } else {
                double answer = num1 % num2;
                result.setText(answer + "");
            }
        });

        // Set the title of the GUI
        primaryStage.setTitle("CS 1331 Calculator");

        // Create a scene to put our final complete container in
        Scene scene = new Scene(container);
        primaryStage.setScene(scene);

        // Show the GUI
        primaryStage.show();
    }

//    public static void main(String[] args) {
//        launch(args);
//    }
}
