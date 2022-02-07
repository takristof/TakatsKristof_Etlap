module hu.petrik.takatskristof_etlap {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.takatskristof_etlap to javafx.fxml;
    exports hu.petrik.takatskristof_etlap;
}