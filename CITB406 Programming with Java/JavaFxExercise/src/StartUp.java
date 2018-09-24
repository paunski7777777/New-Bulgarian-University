import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.control.CheckBox;
import java.io.*;

public class StartUp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FlowPane root = new FlowPane();

        root.setPadding(new Insets(15));
        root.setHgap(10);
        root.setVgap(10);

        stage.setTitle("Hotel Data");

        Scene scene = new Scene(root, 360, 360);

        HBox titleBox = new HBox();
        FlowPane titleFlowPane = new FlowPane();
        Label titleLabel = new Label("Enter info about hotel: ", new ImageView("resources/hotel.png"));

        HBox nameBox = new HBox();
        FlowPane namePane = new FlowPane();
        namePane.setHgap(10);
        Label nameLabel = new Label("Name: ");
        TextField nameTextField = new TextField();
        nameTextField.setPrefColumnCount(15);
        nameTextField.setPromptText("Name");

        namePane.getChildren().addAll(nameLabel, nameTextField);
        nameBox.getChildren().addAll(namePane);

        titleFlowPane.getChildren().add(titleLabel);
        titleBox.getChildren().add(titleFlowPane);

        HBox addressBox = new HBox();
        FlowPane addressPane = new FlowPane();
        addressPane.setHgap(10);
        Label addressLabel = new Label("Address: ");
        TextField addressTextField = new TextField();
        addressTextField.setPrefColumnCount(15);
        addressTextField.setPromptText("Address");

        addressPane.getChildren().addAll(addressLabel, addressTextField);
        addressBox.getChildren().add(addressPane);

        HBox poolBox = new HBox();
        FlowPane poolPane = new FlowPane();
        poolPane.setHgap(10);
        Label poolLabel = new Label("Swimming pool: ");
        RadioButton rbYes = new RadioButton("yes");
        RadioButton rbNo = new RadioButton("no");

        poolPane.getChildren().addAll(poolLabel, rbYes,rbNo);
        poolBox.getChildren().add(poolPane);

        ToggleGroup toggleGroup = new ToggleGroup();
        rbYes.setToggleGroup(toggleGroup);
        rbNo.setToggleGroup(toggleGroup);

        HBox categoryBox = new HBox();
        FlowPane categoryPane = new FlowPane();
        categoryPane.setHgap(10);
        Label categoryLabel = new Label("Category: ");

        ObservableList<String> categoryTypes = FXCollections.observableArrayList("ONE_STAR", "TWO_STARS",
                "THREE_STARS", "FOUR_STARS", "FIVE_STARS");
        ComboBox<String> comboCategory = new ComboBox<>(categoryTypes);
        comboCategory.setValue("THREE_STARS");

        categoryPane.getChildren().addAll(categoryLabel, comboCategory);
        categoryBox.getChildren().add(categoryPane);

        HBox facilitiesBox = new HBox();
        FlowPane facilitiesPane = new FlowPane();
        facilitiesPane.setHgap(10);

        Label facilitiesLabel = new Label("Facilities: ");
        CheckBox parkingChB = new CheckBox("parking");
        CheckBox animatorsChB = new CheckBox("animators");
        CheckBox fitnessChB = new CheckBox("fitness");
        CheckBox saunaChB = new CheckBox("sauna");

        facilitiesPane.getChildren().addAll(facilitiesLabel, parkingChB, animatorsChB, fitnessChB, saunaChB);
        facilitiesBox.getChildren().addAll(facilitiesPane);

        Separator separator1 = new Separator();
        separator1.setPrefWidth(350);

        Label deserializedDataLabel = new Label("Deserialized Data");

        Separator separator2 = new Separator();
        separator2.setPrefWidth(350);

        nameTextField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Search String: " + nameTextField.getText());
            }
        });

        Button saveButton = new Button("Save", new ImageView("resources/save.png"));
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = nameTextField.getText();
                String address = addressTextField.getText();
                boolean hasSwimmingPool = rbYes.isSelected();
                String category = comboCategory.getValue();
                boolean hasParking = parkingChB.isSelected();
                boolean hasAnimators = animatorsChB.isSelected();
                boolean hasFitness = fitnessChB.isSelected();
                boolean hasSauna = saunaChB.isSelected();

                Hotel hotel = new Hotel(name, address, hasSwimmingPool, category, hasParking, hasAnimators, hasFitness, hasSauna);
                serializeHotel("hotel.ser", hotel);
            }
        });

        Button deserializeButon = new Button("Deserialize", new ImageView("resources/deserialize.png"));
        deserializeButon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Hotel hotel = new Hotel();
                String hotelData = deserializeHotel("hotel.ser", hotel);
                deserializedDataLabel.setText(hotelData);
            }
        });

        root.getChildren().addAll(titleFlowPane, namePane, addressPane, poolPane, categoryPane, facilitiesPane,
                separator1, deserializedDataLabel, separator2, saveButton, deserializeButon);
        stage.setScene(scene);
        stage.show();
    }

    private static void serializeHotel(String filePath, Hotel hotel) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(hotel);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private static String deserializeHotel(String filePath, Hotel hotel){
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream inputStream = new ObjectInputStream(fis);) {

            hotel = (Hotel) inputStream.readObject();

            return hotel.toString();

        }
        catch (ClassNotFoundException ex) {
            System.err.println("Class not found: " + ex);
        }
        catch (IOException ex) {
            System.err.println("IO error: " + ex);
        }
        return "No data";
    }
}
