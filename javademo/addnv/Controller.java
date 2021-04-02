package javademo.addnv;

import javademo.Main;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtName;
    public TextField txtPhone;
    public final static String connectString = "jdbc:mysql://localhost:3306/t2009m";
    public final static String username = "root";
    public final static String password = "";// dung xampp thi bo root di
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void submit(){
        String Name = txtName.getText();
        String Phone = txtPhone.getText();
        if(!Name.isEmpty()&&!Phone.isEmpty()){
            Integer phone = Integer.parseInt(Phone);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(connectString,username,password);
                Statement stt = conn.createStatement();
                String txt_sql = "insert into qlnhanvien(name,phone)" + "value ('"+Name+"',"+phone+")";
                stt.execute(txt_sql);
                JOptionPane.showMessageDialog(null,"Add");

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }else {
            JOptionPane.showMessageDialog(null,"False");
        }

    }
    public void deleting() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../delete/delete.fxml"));
        Main.mainStage.setScene(new Scene(root,800,650));
        Main.mainStage.show();
    }


}
