import java.util.ArrayList;
import javafx.scene.layout.HBox;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;    //**Need to import to handle event
import javafx.event.EventHandler;   //**Need to import to handle event
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;    //**Need to import to handle event
import javafx.event.EventHandler;   //**Need to import to handle event
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.text.DecimalFormat;

//import all other necessary javafx classes here
//----

public class InputPane extends HBox
{
    //----
    private Button bLoad;
    private Button bSave;
    private Button bPreview;
    private BorderPane pane;
    private boolean first = false;
    //constructor
    public InputPane()
    {
        ObservableList<String> countryData;
        ListView countryLV;
        String selectedCountry;
        int selectedIndex;

        //set up the GUI layout
        GridPane bottomPane = new GridPane();
        bottomPane.setPadding(new Insets(12, 12, 12, 12));
        bottomPane.setHgap(6);
        bottomPane.setVgap(6);

        GridPane masterPane = new GridPane();
        GridPane previewPane = new GridPane();
        GridPane inputPane = new GridPane();
        
        Label lLoad = new Label("Load file name: ");
        TextField tLoad = new TextField();
        bLoad = new Button("Load");
        bLoad.setOnAction(new ButtonHandler());        
        inputPane.add(lLoad,0,0);
        inputPane.add(tLoad,1,0);
        inputPane.add(bLoad,2,0);
        
        Label lSave = new Label("Save file name: ");
        TextField tSave = new TextField();        
        bSave = new Button("Save");
        bSave.setOnAction(new ButtonHandler());
        inputPane.add(lSave,0,1);
        inputPane.add(tSave,1,1);
        inputPane.add(bSave,2,1);
                
        bPreview = new Button( "Preview:" );
        TextArea tPreview = new TextArea();
        tPreview.setEditable(false);
        previewPane.add(bPreview,0,0);
        previewPane.add(tPreview,0,1);
        
        Label lError = new Label("Error Log:");
        inputPane.add(lError,1,2);
        TextArea tError = new TextArea();
        tError.setEditable(false);
        
        masterPane.add(inputPane,0,0);
        masterPane.add(tError,0,2);
        getChildren().addAll(masterPane,previewPane);

        //tPreview.setText("This is an example text file, please continue to edit text here\n"+
        //                 "\tThis text will be right justified and double spaced as specified, continue\n"+
        //                 "\tentering text\n"+
        //                 "This text returns to default justification, continue entering text. All text\n"+
        //                 "will be inputted in one line until there is 80 characters including spaces.\n"+
        //                 "Insert more text");
        //tError.setText("Invalid file name");
        //Step #1: initialize each instance variable and set up the layout
        //----

        //create a GridPane hold those labels & text fields
        //consider using .setPadding() or setHgap(), setVgap()
        //to control the spacing and gap, etc.
        //----

        //You might need to create a sub pane to hold the button
        //----

        //Set up the layout for the left half of the InputPane.
        //----

        //the right half of the InputPane is simply a TextArea object
        //Note: a ScrollPane will be added to it automatically when there are no
        //enough space

        //Add the left half and right half to the InputPane
        //Note: InputPane extends from HBox
        //----

        //Step #3: register source object with event handler
        //----

    } //end of constructor
    //Step #2: Create a ButtonHandler class
    //ButtonHandler listens to see if the buttont "Enter a Laptop Info." is pushed or not,
    //When the event occurs, it get a laptop's brand, model, CPU, RAM and price
    //information from the relevant text fields, then create a new Laptop object and add it inside
    //the laptopList. Meanwhile it will display the laptop's information inside the text area.
    //It also does error checking in case any of the textfields are empty or wrong data was entered.
    private class ButtonHandler implements EventHandler<ActionEvent>
    {
        //Override the abstact method handle()
        public void handle(ActionEvent e)
        {
            if(e.getSource()==bSave)
            {
                if(first)
                    first=false;
                //set up the GUI layout
                GridPane bottomPane = new GridPane();
                bottomPane.setPadding(new Insets(12, 12, 12, 12));
                bottomPane.setHgap(6);
                bottomPane.setVgap(6);
                
                pane.setBottom(bottomPane);
            }
        } //end of handle() method
    } //end of ButtonHandler class

}