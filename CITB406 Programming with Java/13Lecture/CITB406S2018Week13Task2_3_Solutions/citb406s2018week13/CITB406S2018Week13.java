/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citb406s2018week13;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Kostadinova
 */
public class CITB406S2018Week13 extends Application {

    private ScrollPane root;
    private FlowPane mainFlowPane;
    private final int hGap = 10;
    private final int vGap = 10;
    private Stage stage;

    @Override
    public void start(Stage primaryStage) {

        stage = primaryStage;
        mainFlowPane = new FlowPane();

        root = new ScrollPane(mainFlowPane);

        mainFlowPane.setPadding(new Insets(vGap));

        resgisterHotelForm();

        Scene scene = new Scene(root, 550, 400);

        primaryStage.setTitle("Hotel Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void resgisterHotelForm() {

        GridPane gridPane = new GridPane();

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setHalignment(HPos.RIGHT);
        gridPane.getColumnConstraints().add(column1);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setHalignment(HPos.LEFT);
        gridPane.getColumnConstraints().add(column2);

        gridPane.setPadding(new Insets(20, 0, 0, 0));
        gridPane.setHgap(hGap);
        gridPane.setVgap(vGap);

        ImageView imageView = new ImageView("hotel.png");
        Label titleLabel = new Label("Enter info about the hotel: ", imageView);

        Label nameLabel = new Label("Name: ");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameTextField = new TextField();
        GridPane.setConstraints(nameTextField, 1, 0);
        nameTextField.setPromptText("Name");

        Label addressLabel = new Label("Address: ");
        GridPane.setConstraints(addressLabel, 0, 1);

        TextField addressTextField = new TextField();
        GridPane.setConstraints(addressTextField, 1, 1);

        addressTextField.setPromptText("Address");

        Label poolLabel = new Label("Swimming pool: ");

        GridPane.setConstraints(poolLabel, 0, 2);

        RadioButton rbYes = new RadioButton("yes");
        RadioButton rbNo = new RadioButton("no");

        FlowPane swimmingPoolFlowPane = new FlowPane();
        swimmingPoolFlowPane.setHgap(hGap);
        swimmingPoolFlowPane.setVgap(vGap);
        GridPane.setConstraints(swimmingPoolFlowPane, 1, 2);
        swimmingPoolFlowPane.getChildren().addAll(rbYes, rbNo);

        ToggleGroup tgKind = new ToggleGroup();

        rbYes.setToggleGroup(tgKind);
        rbNo.setToggleGroup(tgKind);

        Label categoryLabel = new Label("Category: ");
        GridPane.setConstraints(categoryLabel, 0, 3);

        ObservableList<String> categoryTypes
                = FXCollections.observableArrayList("ONE_STAR", "TWO_STARS",
                        "THREE_STARS", "FOUR_STARS", "FIVE_STARS");

        ComboBox<String> lvCategory = new ComboBox<String>(categoryTypes);
        GridPane.setConstraints(lvCategory, 1, 3);
        lvCategory.setValue("THREE_STARS");

        Label facilitiesLabel = new Label("Facilities: ");
        CheckBox checkBoxParking = new CheckBox("parking");
        CheckBox checkBoxAnimators = new CheckBox("animators");
        CheckBox checkBoxFitness = new CheckBox("fitness");
        CheckBox checkBoxSauna = new CheckBox("sauna");

        FlowPane facilitiesFlowPane = new FlowPane();
        facilitiesFlowPane.setHgap(hGap);
        facilitiesFlowPane.setVgap(vGap);
        GridPane.setConstraints(facilitiesLabel, 0, 4);
        GridPane.setConstraints(facilitiesFlowPane, 1, 4);
        facilitiesFlowPane.getChildren().addAll(checkBoxParking, checkBoxAnimators, checkBoxFitness, checkBoxSauna);

        Label deserializedDataLabel = new Label("Deserialized Data");
        GridPane.setConstraints(deserializedDataLabel, 1, 5);

        nameTextField.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent ae) {
                System.out.println("Search String: " + nameTextField.getText());
            }
        }
        );
       

        FlowPane fileChooserFlowPane = new FlowPane();
        fileChooserFlowPane.setHgap(hGap);
        fileChooserFlowPane.setVgap(vGap);

        ImageView hotelImageView = new ImageView();
        FileChooser fileChooser = new FileChooser();
        Button openButton = new Button("Open a Picture...");
        GridPane.setConstraints(fileChooserFlowPane, 1, 6);

        fileChooserFlowPane.getChildren().addAll(openButton, hotelImageView);

        openButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(final ActionEvent e) {
                configureFileChooser(fileChooser);
                File file = fileChooser.showOpenDialog(stage);
                if (file != null) {
                    hotelImageView.setImage(new Image(file.toURI().toString()));
                    hotelImageView.setFitWidth(150);
                    hotelImageView.setPreserveRatio(true);
                }
            }
        });

         FlowPane buttonsFlowPane = new FlowPane();
        buttonsFlowPane.setHgap(hGap);
        buttonsFlowPane.setVgap(vGap);

        Button saveBtn = new Button("Save", new ImageView("save.png"));
        Button deserializeBtn = new Button("Deserialize", new ImageView("deserialize.png"));

        buttonsFlowPane.getChildren().addAll(saveBtn, deserializeBtn);
        GridPane.setConstraints(buttonsFlowPane, 1, 7);
        
        gridPane.getChildren().addAll(nameLabel, nameTextField, addressLabel, addressTextField,
                poolLabel, swimmingPoolFlowPane, categoryLabel, lvCategory,
                facilitiesLabel, facilitiesFlowPane, deserializedDataLabel,
                buttonsFlowPane, fileChooserFlowPane);
        mainFlowPane.getChildren().addAll(titleLabel, gridPane);
    }

    private static void configureFileChooser(
            final FileChooser fileChooser) {
        fileChooser.setTitle("View Pictures");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );
    }

}
