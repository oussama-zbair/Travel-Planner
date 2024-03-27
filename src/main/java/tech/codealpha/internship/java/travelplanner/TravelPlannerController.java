package tech.codealpha.internship.java.travelplanner;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TravelPlannerController {

    @FXML
    private TextField destinationInput;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextArea preferencesInput;

    private TravelPlanGenerator planGenerator = new TravelPlanGenerator();

    @FXML
    void generatePlan() {
        String destination = destinationInput.getText();
        String date = datePicker.getValue().toString();
        String preferences = preferencesInput.getText();

        planGenerator.generatePlan(destination, date, preferences);
    }
}
