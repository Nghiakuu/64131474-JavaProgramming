module com.example.tinhtongfx {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.kordamp.bootstrapfx.core;

  opens com.example.tinhtongfx to javafx.fxml;
  exports com.example.tinhtongfx;
}