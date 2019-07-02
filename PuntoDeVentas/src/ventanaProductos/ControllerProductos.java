package ventanaProductos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ControllerProductos {

    @FXML
    public void botonMenu(MouseEvent event){
        try{
            Parent window3;
            window3 = (AnchorPane) FXMLLoader.load(getClass().getResource("../principal/sample.fxml"));

            Scene newScene;
            newScene = new Scene(window3);
            newScene.setFill(Color.TRANSPARENT);
            Stage mainWindow;

            mainWindow = (Stage) ((Node)event.getSource()).getScene().getWindow();
            mainWindow.toFront();
            mainWindow.show();
            mainWindow.setScene(newScene);
            }catch (Exception e){
            e.printStackTrace();
        }
    }
}
