package Lesson6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class addressForm extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Address Form ");
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 620, 150, Color.WHITE);
		GridPane toppane = new GridPane();
		toppane.setPadding(new Insets(5));
		toppane.setHgap(5);
		toppane.setVgap(5);

		ColumnConstraints topColumn1 = new ColumnConstraints(200);
		ColumnConstraints topColumn2 = new ColumnConstraints(200);
		ColumnConstraints topColumn3 = new ColumnConstraints(200);

		toppane.getColumnConstraints().addAll(topColumn1, topColumn2,
				topColumn3);

		Label namelbl = new Label("Name");
		TextField nameFld = new TextField();
		Label streetLbl = new Label("Street");
		TextField streetFld = new TextField();
		Label cityLbl = new Label("City");
		TextField cityFld = new TextField();

		GridPane.setHalignment(namelbl, HPos.LEFT);
		toppane.add(namelbl, 0, 0);

		GridPane.setHalignment(streetLbl, HPos.LEFT);
		toppane.add(streetLbl, 1, 0);

		GridPane.setHalignment(cityLbl, HPos.LEFT);
		toppane.add(cityLbl, 2, 0);

		GridPane.setHalignment(nameFld, HPos.LEFT);
		toppane.add(nameFld, 0, 1);

		GridPane.setHalignment(streetFld, HPos.LEFT);
		toppane.add(streetFld, 1, 1);

		GridPane.setHalignment(cityFld, HPos.LEFT);
		toppane.add(cityFld, 2, 1);

		GridPane middlepane = new GridPane();
		middlepane.setPadding(new Insets(5));
		middlepane.setHgap(5);
		middlepane.setVgap(5);
		ColumnConstraints middleColumn1 = new ColumnConstraints(200);
		ColumnConstraints middleColumn2 = new ColumnConstraints(200);
		middleColumn2.setHgrow(Priority.ALWAYS);
		middlepane.getColumnConstraints().addAll(middleColumn1, middleColumn2);
		Label stateLbl = new Label("State");
		TextField stateFld = new TextField();
		Label zipLbl = new Label("Zip");
		TextField zipFld = new TextField();

		GridPane.setHalignment(stateLbl, HPos.LEFT);
		middlepane.add(stateLbl, 0, 0);

		GridPane.setHalignment(zipLbl, HPos.LEFT);
		middlepane.add(zipLbl, 1, 0);

		GridPane.setHalignment(stateFld, HPos.LEFT);
		middlepane.add(stateFld, 0, 1);

		GridPane.setHalignment(zipFld, HPos.LEFT);
		middlepane.add(zipFld, 1, 1);

		FlowPane middlepane1 = new FlowPane();
		middlepane1.setAlignment(Pos.CENTER);
		middlepane1.getChildren().add(middlepane);

		FlowPane bottompane = new FlowPane();
		Button submitButton = new Button("Submit");

		bottompane.setAlignment(Pos.CENTER);

		bottompane.getChildren().add(submitButton);

		root.setTop(toppane);
		root.setCenter(middlepane1);
		root.setBottom(bottompane);

		submitButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println(nameFld.getText());
				System.out.println(streetFld.getText());
				System.out.println(cityFld.getText() + ", "
						+ stateFld.getText() + " " + zipFld.getText());
			}
		});

		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
