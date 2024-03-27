package tech.codealpha.internship.java.travelplanner;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class TravelPlannerUI {

    private GridPane grid;
    private TravelPlannerController controller;

    public TravelPlannerUI(TravelPlannerController controller) {
        this.controller = controller;
        grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(15);
        grid.setHgap(20);

        initializeUI();
    }

    private void initializeUI() {
        Label destinationLabel = new Label("Destination:");
        GridPane.setConstraints(destinationLabel, 0, 0);
        TextField destinationInput = new TextField();
        destinationInput.setPromptText("Enter destination");
        destinationInput.setStyle("-fx-pref-width: 200px"); // Set custom width
        GridPane.setConstraints(destinationInput, 1, 0);

        Label dateLabel = new Label("Date:");
        GridPane.setConstraints(dateLabel, 0, 1);
        DatePicker datePicker = new DatePicker();
        datePicker.setStyle("-fx-pref-width: 200px"); // Set custom width
        GridPane.setConstraints(datePicker, 1, 1);

        Label preferencesLabel = new Label("Preferences:");
        GridPane.setConstraints(preferencesLabel, 0, 2);
        TextArea preferencesInput = new TextArea();
        preferencesInput.setPromptText("Enter preferences");
        preferencesInput.setStyle("-fx-pref-width: 200px; -fx-pref-height: 100px"); // Set custom width and height
        GridPane.setConstraints(preferencesInput, 1, 2);

        Button generateButton = new Button("Generate Plan");
        GridPane.setConstraints(generateButton, 1, 3);
        generateButton.setOnAction(e -> controller.generatePlan());

        grid.getChildren().addAll(destinationLabel, destinationInput, dateLabel, datePicker, preferencesLabel,
                preferencesInput, generateButton);
    }

}
