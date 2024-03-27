module tech.codealpha.internship.java.travelplanner {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;

    opens tech.codealpha.internship.java.travelplanner to javafx.fxml;
    exports tech.codealpha.internship.java.travelplanner;
}
