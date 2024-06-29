
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.time.LocalTime;

public class AnalogClock extends Application {

    @Override
    public void start(Stage stage) {
        // Create JavaFX panel for embedding
        JFXPanel jfxPanel = new JFXPanel();
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);

        // Create clock circle
        Circle circle = new Circle(200, 200, 100);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        // Create hour hand
        Line hourHand = new Line();
        hourHand.setStrokeWidth(5);
        hourHand.setStroke(Color.BLACK);

        // Create minute hand
        Line minuteHand = new Line();
        minuteHand.setStrokeWidth(3);
        minuteHand.setStroke(Color.BLACK);

        // Create second hand
        Line secondHand = new Line();
        secondHand.setStrokeWidth(1);
        secondHand.setStroke(Color.RED);

        // Add elements to root group
        root.getChildren().addAll(circle, hourHand, minuteHand, secondHand);

        // Set up stage and show scene
        stage.setTitle("Analog Clock");
        stage.setScene(scene);
        stage.show();

        // Timeline to update clock every second
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), e -> {
                    LocalTime time = LocalTime.now();
                    int hour = time.getHour();
                    int minute = time.getMinute();
                    int second = time.getSecond();

                    // Calculate angles for hour, minute, and second hands
                    double hourAngle = (hour % 12 + minute / 60.0) * 30;
                    double minuteAngle = minute * 6;
                    double secondAngle = second * 6;

                    // Rotate hands
                    hourHand.setRotate(hourAngle);
                    minuteHand.setRotate(minuteAngle);
                    secondHand.setRotate(secondAngle);
                })
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
