module YTC.Installer {

    requires javafx.controls;
    requires javafx.graphics;
    requires com.google.gson;

    opens de.craftsarmy.installer to javafx.fxml;
    exports de.craftsarmy.installer;

}