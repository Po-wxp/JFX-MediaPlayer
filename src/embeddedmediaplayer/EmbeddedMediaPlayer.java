package embeddedmediaplayer;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class EmbeddedMediaPlayer extends Application {

    private static final String MEDIA_URL = "movie.mp4";

    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("JavaFX Media Player");
        Group root = new Group();
        Scene scene = new Scene(root, 540, 241);

        // create media player
        Media media = new Media(new File(MEDIA_URL).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        
        MediaControl mediaControl = new MediaControl(mediaPlayer);
        scene.setRoot(mediaControl);

        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
