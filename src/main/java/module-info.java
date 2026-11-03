module com.ggast.calculator {

    requires javafx.controls;
    requires javafx.fxml;

    exports com.ggast.calculator;

    opens com.ggast.calculator to javafx.fxml;
}