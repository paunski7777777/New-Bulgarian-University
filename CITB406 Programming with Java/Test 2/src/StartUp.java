import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StartUp extends Application {
    public static void main(String[] args) {

        launch(args);

        DanceClub danceClub = new DanceClub("Funky Monkeys", 30, 50, true);
        DanceClub danceClub2 = new DanceClub("dc1", 10, 100, false);
        DanceClub danceClub3 = new DanceClub("dc2", 20, 70, true);

        try {
            danceClub.setNumberOfParticipants(10);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        danceClub.writeDanceClubNames("DanceClub.txt");
        danceClub2.writeDanceClubNames("DanceClub.txt");
        danceClub3.writeDanceClubNames("DanceClub.txt");

        System.out.println(danceClub.areSymbolsNeighbours('F', 'u'));
        System.out.println(danceClub.areSymbolsNeighbours('u', 'a'));
        System.out.println(danceClub.areSymbolsNeighbours('n', 'u'));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();

        root.setPadding(new Insets(30));
        root.setHgap(20);
        root.setVgap(20);

        primaryStage.setTitle("DanceClub Data!");
        Scene scene = new Scene(root, 500, 300);

        HBox titleBox = new HBox();
        FlowPane titlePane = new FlowPane();
        Label titleLabel = new Label("Enter Data about the DanceClub: ");

        titlePane.getChildren().add(titleLabel);
        titleBox.getChildren().add(titlePane);

        HBox nameBox = new HBox();
        FlowPane namePane = new FlowPane();
        namePane.setHgap(10);
        Label nameLabel = new Label("Name: ");
        TextField nameTextField = new TextField();
        nameTextField.setPrefColumnCount(15);
        nameTextField.setPromptText("Name");

        namePane.getChildren().addAll(nameLabel, nameTextField);
        nameBox.getChildren().addAll(namePane);

        HBox numberOfParticipantsBox = new HBox();
        FlowPane numberOfParticipantsPane = new FlowPane();
        namePane.setHgap(10);
        Label numberOfParticipantsLabel = new Label("Number of Participants: ");
        TextField numberOfParticipantsTextField = new TextField();
        numberOfParticipantsTextField.setPrefColumnCount(15);
        numberOfParticipantsTextField.setPromptText("Name");

        numberOfParticipantsPane.getChildren().addAll(numberOfParticipantsLabel, numberOfParticipantsTextField);
        numberOfParticipantsBox.getChildren().addAll(numberOfParticipantsPane);

        HBox adultsBox = new HBox();
        FlowPane adultsPane = new FlowPane();
        adultsPane.setHgap(10);
        Label poolLabel = new Label("Is for Adults: ");
        RadioButton rbYes = new RadioButton("yes");
        RadioButton rbNo = new RadioButton("no");

        adultsPane.getChildren().addAll(poolLabel, rbYes, rbNo);
        adultsBox.getChildren().add(adultsPane);

        ToggleGroup toggleGroup = new ToggleGroup();
        rbYes.setToggleGroup(toggleGroup);
        rbNo.setToggleGroup(toggleGroup);

        Button saveButton = new Button("Save DanceClub Data");
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = nameTextField.getText();
                int numberOfParticipants = Integer.parseInt(numberOfParticipantsTextField.getText());
                boolean isForAdults = rbYes.isSelected();

                DanceClub danceClub = new DanceClub(name, numberOfParticipants, 50, isForAdults);
                System.out.println(danceClub.toString());
            }
        });

        root.getChildren().addAll(titlePane, namePane, numberOfParticipantsPane, adultsPane, saveButton);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}