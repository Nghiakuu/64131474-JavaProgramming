package com.example.tinhtongfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
  public Button btnTinhTong;
  @FXML
  private TextField txtA;
  @FXML
  private TextField txtB;
  @FXML
  private TextField txtKQ;
  public void tinhTong(ActionEvent event) {
    int a = Integer.parseInt(txtA.getText());
    int b = Integer.parseInt(txtB.getText());
    String kq = String.valueOf(a + b);
    txtKQ.setText(kq);
  }
}
