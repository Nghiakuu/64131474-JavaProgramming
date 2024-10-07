package com.example.tinhtongfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gui_tinhtong.fxml"));
    stage.setTitle("Hello!");
    stage.setScene(new Scene(fxmlLoader.load(), 320, 240));
    stage.show();


  }

  public static void main(String[] args) {
    launch();
  }
}