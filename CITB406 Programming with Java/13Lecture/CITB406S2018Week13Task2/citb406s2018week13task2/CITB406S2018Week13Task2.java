/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citb406s2018week13task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 *
 * @author Kostadinova
 */
public class CITB406S2018Week13Task2 extends Application {

    public static void serializeHotel(String filePath, Hotel hotel) {
        try (FileOutputStream fos = new FileOutputStream(filePath);
                ObjectOutputStream outputStream = new ObjectOutputStream(fos);) {
            outputStream.writeObject(hotel);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static String deserializeHotel(String filePath, Hotel hotel) {
        try (FileInputStream fis = new FileInputStream(filePath);
                ObjectInputStream inputStream = new ObjectInputStream(fis);) {

            hotel = (Hotel) inputStream.readObject();

            return hotel.toString();

        } catch (ClassNotFoundException ex) {
            System.err.println("Class not found: " + ex);
        } catch (IOException ex) {
            System.err.println("IO error: " + ex);
        }
        return "No data";

    }

    @Override
    public void start(Stage primaryStage) {

        int hGap = 10;
        int vGap = 10;
        int prefferedWidth = 15;

        FlowPane root = new FlowPane();

        root.setPadding(
                new Insets(15));
        root.setHgap(hGap);

        root.setVgap(vGap);

        HBox titleHBox = new HBox();
        FlowPane titleFlowPane = new FlowPane();
        Label titleLabel = new Label("Enter info about the hotel: ", new ImageView("hotel.png"));

        titleFlowPane.getChildren().add(titleLabel);
        titleHBox.getChildren().add(titleFlowPane);

        HBox nameHBox = new HBox();
        FlowPane nameFlowPane = new FlowPane();

        nameFlowPane.setHgap(hGap);

        Label nameLabel = new Label("Name: ");
        TextField nameTextField = new TextField();

        nameTextField.setPrefColumnCount(prefferedWidth);

        nameTextField.setPromptText("Name");

        nameFlowPane.getChildren().addAll(nameLabel, nameTextField);
        nameHBox.getChildren().addAll(nameFlowPane);

        HBox addressHBox = new HBox();
        FlowPane addressFlowPane = new FlowPane();

        nameFlowPane.setHgap(hGap);

        Label dateLabel = new Label("Address: ");
        TextField addressTextField = new TextField();

        addressTextField.setPrefColumnCount(prefferedWidth);

        addressTextField.setPromptText(
                "Address");

        addressFlowPane.getChildren().addAll(dateLabel, addressTextField);
        addressHBox.getChildren().addAll(addressFlowPane);
        addressFlowPane.setHgap(hGap);

        HBox poolHBox = new HBox();
        FlowPane poolFlowPane = new FlowPane();

        nameFlowPane.setHgap(hGap);

        Label poolLabel = new Label("Swimming pool: ");
        RadioButton rbYes = new RadioButton("yes");
        RadioButton rbNo = new RadioButton("no");

        poolFlowPane.getChildren().addAll(poolLabel, rbYes, rbNo);
        poolHBox.getChildren().addAll(poolFlowPane);
        poolFlowPane.setHgap(hGap);

        ToggleGroup tgKind = new ToggleGroup();

        rbYes.setToggleGroup(tgKind);

        rbNo.setToggleGroup(tgKind);

        HBox categoryHBox = new HBox();
        FlowPane categoryFlowPane = new FlowPane();

        categoryFlowPane.setHgap(hGap);

        Label categoryLabel = new Label("Category: ");

        ObservableList<String> categoryTypes
                = FXCollections.observableArrayList("ONE_STAR", "TWO_STARS",
                        "THREE_STARS", "FOUR_STARS", "FIVE_STARS");

        ComboBox<String> lvCategory = new ComboBox<String>(categoryTypes);

        lvCategory.setValue("THREE_STARS");

        categoryFlowPane.getChildren().addAll(categoryLabel, lvCategory);
        categoryHBox.getChildren().addAll(categoryFlowPane);
        categoryFlowPane.setHgap(hGap);

        HBox facilitiesHBox = new HBox();
        FlowPane facilitiesFlowPane = new FlowPane();

        facilitiesFlowPane.setHgap(hGap);

        Label facilitiesLabel = new Label("Facilities: ");
        CheckBox checkBoxParking = new CheckBox("parking");
        CheckBox checkBoxAnimators = new CheckBox("animators");
        CheckBox checkBoxFitness = new CheckBox("fitness");
        CheckBox checkBoxSauna = new CheckBox("sauna");

        facilitiesFlowPane.getChildren().addAll(facilitiesLabel, checkBoxParking, checkBoxAnimators, checkBoxFitness, checkBoxSauna);
        facilitiesHBox.getChildren().addAll(facilitiesFlowPane);
        facilitiesFlowPane.setHgap(hGap);

        Separator separator1 = new Separator();

        separator1.setPrefWidth(
                350);

        Label deserializedDataLabel = new Label("Deserialized Data");

        Separator separator2 = new Separator();

        separator2.setPrefWidth(350);

        nameTextField.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent ae) {
                System.out.println("Search String: " + nameTextField.getText());
            }
        }
        );

        Button saveBtn = new Button("Save", new ImageView("save.png"));
        saveBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String name = nameTextField.getText();
                String address = addressTextField.getText();
                boolean hasSwimmingPool = rbYes.isSelected();
                String category = lvCategory.getValue();
                boolean hasParking = checkBoxParking.isSelected();
                boolean hasAnimators = checkBoxAnimators.isSelected();
                boolean hasFitness = checkBoxFitness.isSelected();
                boolean hasSauna = checkBoxSauna.isSelected();

                Hotel hotel = new Hotel(name, address, hasSwimmingPool, category,
                        hasParking, hasAnimators, hasFitness, hasSauna);
                serializeHotel("hotel.ser", hotel);
            }
        });

        Button deserializeBtn = new Button("Deserialize", new ImageView("deserialize.png"));
        deserializeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Hotel hotel = new Hotel();
                String hotelData = deserializeHotel("hotel.ser", hotel);
                deserializedDataLabel.setText(hotelData);

            }
        });

        root.getChildren().addAll(titleFlowPane, nameFlowPane, addressFlowPane, poolFlowPane, categoryFlowPane, facilitiesFlowPane,
                separator1, deserializedDataLabel, separator2, saveBtn, deserializeBtn);
        Scene scene = new Scene(root, 360, 360);

        primaryStage.setTitle("Hotel Data");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
