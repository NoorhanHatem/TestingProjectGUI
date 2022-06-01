module com.example.testingprojectgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testingprojectgui to javafx.fxml;
    exports com.example.testingprojectgui;
}