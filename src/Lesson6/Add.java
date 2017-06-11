package Lesson6;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Add extends Application {
	

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
//		//	ObservableList<String>list=ObservableList<>();
//			list.add("AB");
//			list.add("IO");
//			list.add("DC");
//			list.add("LA");
//		TableView<String> table = new TableView<String>();
//		table.setItems(list);;
//		toppane.add(table, 0, 0);
//		primaryStage.setScene(scene);
//		primaryStage.show();
	}
		
}
	