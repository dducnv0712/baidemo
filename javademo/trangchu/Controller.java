package javademo.trangchu;

import javademo.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class Controller {
    //giao diện thêm
    public void add() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../addnv/qlnhanvien.fxml"));
        Main.mainStage.setScene(new Scene(root,800,600));
        Main.mainStage.show();
    }
    //giao diện xóa
    public void delete() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../delete/delete.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
        Main.mainStage.show();
    }
}
