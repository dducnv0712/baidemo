package javademo.delete;

import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    //khai báo ô nhập
    public TextField txtID;
    //kết nối sql
    public final static String connectString = "jdbc:mysql://localhost:3306/t2009m";
    public final static String username = "root";
    public final static String password = "";// dung xampp thi bo root di
    //khai báo đối tượng nút
    public void delete(){
        //đặt kiểu dữ liệu cho ô nhập
        //getText chỉ nhận string nên phải khai báo string
        String ID =txtID.getText();
        if (!ID.isEmpty()){
            //thay đổi kiểu giữ liệu
            Integer id = Integer.parseInt(ID);
            //thực hiện lệnh
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(connectString,username,password);
                Statement stt = conn.createStatement();
                //câu lện trong sql
                String txt_sql = "delete from  qlnhanvien where id ="+id+" ";
                stt.execute(txt_sql);
                //hiển thị ô thông báo
                JOptionPane.showMessageDialog(null,"Delete");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
