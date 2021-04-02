package javademo;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
//thêm nơi hiển thị giao diện
    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //giao diện hiển thị chính
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("trangchu/trangchu.fxml"));
        primaryStage.setTitle("Assignment 3");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}