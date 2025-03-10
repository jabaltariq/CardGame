package csf.cardgame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.script.*;
import java.io.IOException;
import java.util.Random;

public class CardGameController {

    @FXML
    private Button verifyButton;

    @FXML
    private Button refreshButton;

    @FXML
    private ImageView card1;

    @FXML
    private ImageView card2;

    @FXML
    private ImageView card3;

    @FXML
    private ImageView card4;

    @FXML
    private Label feedbackText;

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private TextField tf3;

    @FXML
    private TextField tf4;

    @FXML
    private MenuButton mb1;

    @FXML
    private MenuButton mb2;

    @FXML
    private MenuButton mb3;

    Card internal1;
    Card internal2;
    Card internal3;
    Card internal4;

    @FXML
    private void showInstructions() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("instructions.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 375, 238);
        stage.setTitle("instructions");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void generateNew() {
        Random rnd = new Random();

        internal1 = new Card(rnd.nextInt(4), rnd.nextInt(13));
        Image card1Image = new Image(String.valueOf(getClass().getResource(internal1.getImage())));
        card1.setImage(card1Image);

        internal2 = new Card(rnd.nextInt(4), rnd.nextInt(13));
        Image card2Image = new Image(String.valueOf(getClass().getResource(internal2.getImage())));
        card2.setImage(card2Image);

        internal3 = new Card(rnd.nextInt(4), rnd.nextInt(13));
        Image card3Image = new Image(String.valueOf(getClass().getResource(internal3.getImage())));
        card3.setImage(card3Image);

        internal4 = new Card(rnd.nextInt(4), rnd.nextInt(13));
        Image card4Image = new Image(String.valueOf(getClass().getResource(internal4.getImage())));
        card4.setImage(card4Image);

    }

    @FXML
    private void evaluate() {
        boolean isValid1;
        boolean isValid2;
        boolean isValid3;
        boolean isValid4;
        int result = 0;
        isValid1 = internal1.rankIsEqual(Integer.parseInt(tf1.toString())) ||
                   internal2.rankIsEqual(Integer.parseInt(tf2.toString())) ||
                   internal3.rankIsEqual(Integer.parseInt(tf3.toString())) ||
                   internal4.rankIsEqual(Integer.parseInt(tf4.toString()));

        isValid2 = internal1.rankIsEqual(Integer.parseInt(tf1.toString())) ||
                   internal2.rankIsEqual(Integer.parseInt(tf2.toString())) ||
                   internal3.rankIsEqual(Integer.parseInt(tf3.toString())) ||
                   internal4.rankIsEqual(Integer.parseInt(tf4.toString()));

        isValid3 = internal1.rankIsEqual(Integer.parseInt(tf1.toString())) ||
                   internal2.rankIsEqual(Integer.parseInt(tf2.toString())) ||
                   internal3.rankIsEqual(Integer.parseInt(tf3.toString())) ||
                   internal4.rankIsEqual(Integer.parseInt(tf4.toString()));

        isValid4 = internal1.rankIsEqual(Integer.parseInt(tf1.toString())) ||
                   internal2.rankIsEqual(Integer.parseInt(tf2.toString())) ||
                   internal3.rankIsEqual(Integer.parseInt(tf3.toString())) ||
                   internal4.rankIsEqual(Integer.parseInt(tf4.toString()));

        if (isValid1 && isValid2 && isValid3 && isValid4) {
            switch (mb1.getText()) {
                case "+":
                    result = internal1.getRank() + internal2.getRank();
                    break;
                case "-":
                    result = internal1.getRank() - internal2.getRank();
                    break;
                case "/":
                    result = internal1.getRank() / internal2.getRank();
                    break;
                case "*":
                    result = internal1.getRank() * internal2.getRank();
                    break;
            }

            switch (mb2.getText()) {
                case "+":
                    result = result + internal3.getRank();
                    break;
                case "-":
                    result = result - internal3.getRank();
                    break;
                case "/":
                    result = result / internal3.getRank();
                    break;
                case "*":
                    result = result * internal3.getRank();
                    break;
            }

            switch (mb3.getText()) {
                case "+":
                    result = result + internal4.getRank();
                    break;
                case "-":
                    result = result - internal4.getRank();
                    break;
                case "/":
                    result = result / internal4.getRank();
                    break;
                case "*":
                    result = result * internal4.getRank();
                    break;
            }
        }

        if (result == 21) {
            System.out.println("wincon");
            feedbackText.setText("You win!");
        }
        else {
            feedbackText.setText("Try again!");
        }

    }

    @FXML
    private void setToOption1a() {
        mb1.setText("+");
    }

    @FXML
    private void setToOption2a() {
        mb1.setText("-");
    }

    @FXML
    private void setToOption3a() {
        mb1.setText("/");
    }

    @FXML
    private void setToOption4a() {
        mb1.setText("*");
    }

    @FXML
    private void setToOption1b() {
        mb2.setText("+");
    }

    @FXML
    private void setToOption2b() {
        mb2.setText("-");
    }

    @FXML
    private void setToOption3b() {
        mb2.setText("/");
    }

    @FXML
    private void setToOption4b() {
        mb2.setText("*");
    }

    @FXML
    private void setToOption1c() {
        mb3.setText("+");
    }

    @FXML
    private void setToOption2c() {
        mb3.setText("-");
    }

    @FXML
    private void setToOption3c() {
        mb3.setText("/");
    }

    @FXML
    private void setToOption4c() {
        mb3.setText("*");
    }
}