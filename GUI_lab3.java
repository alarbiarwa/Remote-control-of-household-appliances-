/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_lab3;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.*;
import java.awt.Font;
import static java.awt.SystemColor.text;
import javafx.application.Application;
//import javafx.application.Application.launch;
import javafx.event.*;
//import javafx.event.EventHandler;
import javafx.geometry.*;
//import javafx.geometry.Insets;
//import javafx.geometry.Orientation;
//import javafx.geometry.Pos;
//import javafx.geometry.VPos;
import javafx.scene.*;
//import javafx.scene.Scene;
import javafx.scene.control.*;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.ContentDisplay;
//import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.Slider;
//import javafx.scene.control.ToggleGroup;
import javafx.scene.image.*;
//import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
//import javafx.scene.layout.ColumnConstraints;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.RowConstraints;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.FontWeight;
//import javafx.scene.shape.Ellipse;
//import javafx.scene.shape.Line;
//import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author arwaelarabi
 */
public class GUI_lab3 extends Application {
    
    @Override
    public void start(Stage stage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
        
        
//         FlowPane pane = new FlowPane(Orientation.HORIZONTAL); //Orientation.VERTICAL
//        pane.setPadding(new Insets(300, 20, 20, 800));
//        pane.setHgap(10);
//        pane.setVgap(10);
//        Rectangle rectangle1 =new Rectangle(20, 20);
//        rectangle1.setFill(Color.RED);
//        Text text = new Text();
//        text.setText("%%%%%%%%%%"); 
//        
//        Rectangle rectangle2 =new Rectangle(20, 20);
//        rectangle2.setFill(Color.RED);
//        Text text2 = new Text();
//        text2.setText("#########");
//        pane.getChildren().addAll(text, rectangle1,text2,rectangle2);
////        pane.getChildren().addAll(new Text("Node 4"), new Line(30,30,70,30), new Text("LastNode"));
//        
        //اول لاياوت
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(160, 20, 20, 700));
pane.setHgap(10);
pane.setVgap(10);
//For aligning nodes inside the GridPane

ColumnConstraints column2 = new ColumnConstraints();
column2.setHalignment(HPos.LEFT);
pane.getColumnConstraints().add(column2);


ColumnConstraints column1 = new ColumnConstraints();
column1.setHalignment(HPos.LEFT); //RIGHT
pane.getColumnConstraints().add(column1);


pane.add(new Rectangle(20, 20),0,0);
pane.add(new Text(""),1,0);


pane.add(new Text(""),1,1);
pane.add(new Rectangle(20, 20),0,1);
//
pane.add(new Text(""),1,2);
pane.add(new Rectangle(20, 20),0,2);

pane.add(new Text(""),1,3);
pane.add(new Rectangle(20, 20),0,3);

pane.setAlignment(Pos.CENTER);
//For showing the grid lines
pane.setGridLinesVisible(false);



//ريديو بوتون
BorderPane pane4 = new BorderPane();
// pane4.setPadding(new Insets(306, 20, 20, 700));
VBox paneForRadioButtons = new VBox(20);
paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: black");
RadioButton rbRed = new RadioButton("Faster");
RadioButton rbGreen = new RadioButton("Less consumption");
paneForRadioButtons.getChildren().addAll(rbRed, rbGreen);
pane4.setLeft(paneForRadioButtons);
ToggleGroup group = new ToggleGroup();
rbRed.setToggleGroup(group);
rbGreen.setToggleGroup(group);


//ليبل الريديو بوتون
  Label lb1 = new Label("ENERGY",paneForRadioButtons);
//       lb1.setFont(Font.font("Calibri",FontWeight.BOLD,28));
       lb1.setContentDisplay(ContentDisplay.BOTTOM);
     lb1.setTextFill(Color.BLACK);
      VBox pane8 = new VBox(5);
      pane8.setPadding(new Insets(285, 20, 20, 700));
       pane8.getChildren().add(lb1);






 HBox paneForButtons = new HBox(6);

ImageView T=new ImageView("https://pbs.twimg.com/profile_images/378800000827766682/6b7e29498f26e9a8f81e9875bcca6438_400x400.png");
          T.setFitWidth(7);
          T.setFitHeight(7);
          
        ImageView P=new ImageView("https://media.gettyimages.com/vectors/open-button-vector-id493748300?s=612x612");
            P.setFitWidth(7);
            P.setFitHeight(7);
            
               Button btLeft = new Button("START",T);
               Button btRight = new Button("STOP",P);
               
      paneForButtons.getChildren().addAll(btLeft, btRight);
      paneForButtons.setAlignment(Pos.CENTER);
//      paneForButtons.setStyle("-fx-border-color: green");
       BorderPane pane1 = new BorderPane();
   pane1.setBottom(paneForButtons);
    pane1.setPadding(new Insets(384, 20, 20, 703));
//  
        
    
   
    
    //الشيك بوكس
    BorderPane pane3 = new BorderPane();
        VBox paneForCheckBoxes = new VBox(10);
//         pane3.setPadding(new Insets(160, 10, 10, 697));
paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
paneForCheckBoxes.setStyle("-fx-border-color: LIGHTSLATEGREY; -fx-border-width: 2");
CheckBox chkBold = new CheckBox("Clock Kitchen Timer");
CheckBox chkItalic = new CheckBox("Time Defrost");
CheckBox chkBold1 = new CheckBox("Grill/Combi");
CheckBox chkItalic1 = new CheckBox("microwave");
paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic,chkBold1,chkItalic1);
pane3.setRight(paneForCheckBoxes);


 //ليبل التشيك بوكس
  Label lb2 = new Label("PROGRAM",paneForCheckBoxes);
//       lb1.setStyle("-fx-border-color: black; -fx-border-width: 2");
       lb2.setContentDisplay(ContentDisplay.BOTTOM);
     lb2.setTextFill(Color.BLACK);
      VBox pane9 = new VBox(30);
      pane9.setPadding(new Insets(137, 20, 20, 697));
       pane9.getChildren().add(lb2);

        


         //المستطيل
        FlowPane pane2 = new FlowPane(Orientation.HORIZONTAL); //Orientation.VERTICAL
        pane2.setPadding(new Insets(130, 20, 20, 696));
        Rectangle rectangle = new Rectangle(150, 286);
        rectangle.setFill(Color.GAINSBORO);
        pane2.getChildren().add(rectangle);
        

    
        //صورة الميكرويف
        Image image = new Image("https://images.samsung.com/is/image/samsung/sa-microwave-oven-solo-me83dw-me83dw-zam-frontwhite-142444832?$720_576_PNG$");
ImageView imageView = new ImageView(image);//Setting the image view
imageView.setX(50); //Setting the image position
imageView.setY(25);
imageView.setFitHeight(550); //setting the fit height and width of the image view
imageView.setFitWidth(850);
        


       
//الاضاءة
        Slider slider = new Slider();
slider.setMin(0);
slider.setMax(100);
slider.setValue(40);//the current value
slider.setShowTickLabels(true);//showing the numbers as labels or not
slider.setShowTickMarks(true);//showing the ticks mark or not
slider.setMajorTickUnit(50);//where to put major ticks
slider.setMinorTickCount(5);//the number of minor ticks in the slider
slider.setBlockIncrement(10);//how many positions the pointer is moved
BorderPane pane5 = new BorderPane();
// pane5.setPadding(new Insets(450, 20, 20, 540));
//ليبل الاضاءة 
  Label lb3 = new Label("radiation intensity",slider);
//       lb1.setFont(Font.font("Calibri",FontWeight.BOLD,28));
       lb3.setContentDisplay(ContentDisplay.BOTTOM);
     lb3.setTextFill(Color.BLACK);
      VBox pane6 = new VBox(30);
      pane6.setPadding(new Insets(447, 20, 20, 500));
       pane6.getChildren().add(lb3);
       
pane5.setCenter(slider);
               
        
//
//Ellipse ellipse = new Ellipse(50, 50, 50, 25);
//ellipse.setStroke(Color.GREEN);
//ellipse.setFill(Color.WHITE);
//StackPane stackPane = new StackPane();
//stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));
//Label lb5 = new Label("A pane inside a label", stackPane);
//lb5.setContentDisplay(ContentDisplay.BOTTOM);
//VBox pane6 = new VBox(20);


//Label lb4 = new Label("Ellipse", new Ellipse(50, 50, 50, 25));
//       lb4.setContentDisplay(ContentDisplay.LEFT);
//   
//       Ellipse ellipse = new Ellipse(50, 50, 50, 25);
//       ellipse.setStroke(Color.GREEN);
//       ellipse.setFill(Color.WHITE);
//       StackPane stackPane = new StackPane();
//       stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));
//       Label lb5 = new Label("A pane inside a label", stackPane);
//       lb5.setContentDisplay(ContentDisplay.BOTTOM);
//     
//       VBox pane6 = new VBox(20);
//       pane6.getChildren().add(lb4);
//Label lb4 = new Label("Ellipse", new Ellipse(250, 50, 50, 25));
//pane6.setPadding(new Insets(450, 20, 20, 503));
// StackPane stackPane = new StackPane();
// Ellipse ellipse = new Ellipse(250, 50, 50, 25);
// stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));
//pane.getChildren().add(lb4);


         Group root = new Group(imageView,pane2,pane,pane1,pane8,pane4,pane9,pane3,pane6,pane5); 
        Scene scene = new Scene(root, 900, 600);
        
        
        
        stage.setTitle("Lab3_Smart_Home1");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}






//        rectangle.setFill(Color.WHITE);
//        
//        BorderPane pane2 = new BorderPane();    
//        HBox right = new HBox();
//right.getChildren().add(new Rectangle(50, 30));
//right.setStyle("-fx-border-color: LIGHTSLATEGREY;");
//        pane2.setRight(right);
//        
////        //المستطيل
//         Rectangle rectangle = new Rectangle();
//          rectangle.setX(700);
//          rectangle.setY(135);
//          rectangle.setWidth(140);
//          rectangle.setHeight(280);
//          rectangle.setFill(Color.WHITE);
//          rectangle.setStroke(Color.LIGHTSLATEGREY);
//          rectangle.setStrokeWidth(3);