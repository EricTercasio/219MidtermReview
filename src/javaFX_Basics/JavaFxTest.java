package javaFX_Basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by Kitcatski on 11/4/2017.
 */
public class JavaFxTest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();
        circle.setCenterX(50);
        circle.setCenterY(50);
        circle.setRadius(40);
        circle.setStroke(Color.BLACK);
        Circle circle1 = new Circle();
        circle1.setCenterX(100);
        circle1.setCenterY(100);
        circle1.setRadius(40);
        circle1.setFill(Color.RED);
        Pane pane = new Pane();
        pane.getChildren().addAll(circle,circle1);
        Scene scene = new Scene(pane,300,300);
        primaryStage.setScene(scene);
        primaryStage.show();



    }
    public static void main(String[] args){
        launch(args);

    }
}
