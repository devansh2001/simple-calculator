import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Declare your nodes
        Label playerNameLabel = new Label("Player Name: ");
        Label currentPlayerName = new Label("Shreyas");

        // Declare your container
        HBox playerData = new HBox();

        // Put stuff into container
        playerData.getChildren().addAll(playerNameLabel, currentPlayerName);

        Button b00 = new Button();
        Button b01 = new Button();
        Button b02 = new Button();
        Button b10 = new Button();
        Button b11 = new Button();
        Button b12 = new Button();
        Button b20 = new Button();
        Button b21 = new Button();
        Button b22 = new Button();
        Button reset = new Button("Reset");

        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        HBox row4 = new HBox();

        row1.getChildren().addAll(b00, b01, b02);
        row2.getChildren().addAll(b10, b11, b12);
        row3.getChildren().addAll(b20, b21, b22);
        row4.getChildren().addAll(reset);

        VBox total_grid_box = new VBox();
        total_grid_box.getChildren().addAll(row1, row2, row3, row4);

        VBox entire_box = new VBox();
        entire_box.getChildren().addAll(playerData, total_grid_box);


        // Tasks:
        // 1. Change X to O and O to X (Use Lambda expressions)
        // 2. Add a RESET Button to
        // 3. Change the Name from Shreyas to Devansh or Devansh to Shreyas
        // (Use Anonymous Inner Classes) when RESET is clicked


        b00.setOnAction(e -> {
            if (b00.getText().equals("X") || b00.getText().equals("")) {
                b00.setText("O");
            } else {
                b00.setText("X");
            }
        });
        b01.setOnAction(e -> {
            if (b00.getText().equals("X") || b00.getText().equals("")) {
                b00.setText("O");
            } else {
                b00.setText("X");
            }
        });
        //... and so on

        reset.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                if (reset.getText().equals("Shreyas") || reset.getText().equals("")) {
                    reset.setText("Devansh");
                } else {
                    reset.setText("Shreyas");
                }
            }
        });


        // JavaFX stuff
        Scene scene = new Scene(entire_box);
        primaryStage.setScene(scene);

        // Set title
        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.show();
    }
}
