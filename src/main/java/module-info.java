module csf.cardgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires openai.java.sdk;
    requires java.scripting;

    opens csf.cardgame to javafx.fxml;
    exports csf.cardgame;
}