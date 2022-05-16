import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;


public class Design extends Application {
  // Anfang Attribute
  private Rectangle rectangle1 = new Rectangle();
  private Rectangle rectangle1 = new Rectangle();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 929, 680);
    // Anfang Komponenten
    
    rectangle1.setX(16);
    rectangle1.setY(24);
    rectangle1.setWidth(884);
    rectangle1.setHeight(642);
    rectangle1.setFill(Color.BLUE);
    root.getChildren().add(rectangle1);
    root.getChildren().add(rectangle1);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("Design");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public Design
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  // Ende Methoden
} // end of class Design

