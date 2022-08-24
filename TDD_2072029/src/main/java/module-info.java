module com.example.tdd_2072029 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tdd_2072029 to javafx.fxml;
    exports com.example.tdd_2072029;
}