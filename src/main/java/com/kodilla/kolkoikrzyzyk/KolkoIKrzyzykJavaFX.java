package com.kodilla.kolkoikrzyzyk;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Scanner;

public class KolkoIKrzyzykJavaFX extends Application {


    Image imageback = new Image("file:src/main/resources/plansza.png");
    Image circle = new Image("file:src/main/resources/kółko.png");
    Image cross = new Image("file:src/main/resources/krzyżyk.png");
    private FlowPane symbols = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {

        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(11.5,12.5,13.5,14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img1 = new ImageView(circle);
        ImageView img2 = new ImageView(cross);
        symbols.getChildren().add(img1);
        symbols.getChildren().add(img2);

        grid.add(symbols, 0, 0, 1, 1);

        Scene scene = new Scene(grid, 600, 400, Color.BLACK);

        primaryStage.setTitle("kółko i krzyżyk");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
