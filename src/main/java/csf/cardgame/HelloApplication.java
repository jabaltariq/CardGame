package csf.cardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.devlive.sdk.common.listener.ConsoleEventSourceListener;
import org.devlive.sdk.openai.OpenAiClient;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*CountDownLatch countDownLatch = new CountDownLatch(1);
        ConsoleEventSourceListener listener = ConsoleEventSourceListener.builder()
                .countDownLatch(countDownLatch)
                .build();
        OpenAiClient client = OpenAiClient.builder()
                .apiKey(System.getProperty("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"))
                .listener(listener)
                .build();*/

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("card-game.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 375, 238);
        stage.setTitle("CardGame");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}