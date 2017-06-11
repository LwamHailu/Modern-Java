package Lesson6;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StringUtility extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("String Utility");
		HBox root = new HBox();
		Scene scene = new Scene(root, 350, 120, Color.WHITE);
		VBox buttonsPane = new VBox(5);
		buttonsPane.setPadding(new Insets(20));

		Button count = new Button("Count Letters");
		count.setMinWidth(120);
		Button reverse = new Button("Reverse Letters");
		reverse.setMinWidth(120);
		Button removeDup = new Button("Remove Duplicates");
		removeDup.setMinWidth(120);
		buttonsPane.getChildren().addAll(count, reverse, removeDup);

		VBox fieldsPane = new VBox(5);
		fieldsPane.setPadding(new Insets(10));

		Label inputlbl = new Label("input");
		TextField inputFld = new TextField();
		Label outputLbl = new Label("output");
		TextField outputFld = new TextField();

		fieldsPane.getChildren().addAll(inputlbl, inputFld, outputLbl,
				outputFld);

		root.getChildren().addAll(buttonsPane, fieldsPane);

		count.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				outputFld.setText(Integer.valueOf(
						countString(inputFld.getText())).toString());
			}
		});

		reverse.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				outputFld.setText(reverseString(inputFld.getText()));
			}
		});

		removeDup.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				outputFld.setText(removeDuplicateString(inputFld.getText()));
			}
		});

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}

		return sb.toString();
	}

	public int countString(String s) {
		int count = 0;
		while (count < s.length()) {
			count++;
		}
		return count;
	}

	public String removeDuplicateString(String s) {
		char[] chars = s.toCharArray();
		ArrayList<Character> arraylist = new ArrayList<>();
		for (int i = 0; i < chars.length; i++) {
			arraylist.add(chars[i]);
		}

		for (int i = 0; i < arraylist.size(); i++) {
			for (int j = i + 1; j < arraylist.size(); j++) {
				if (arraylist.get(i).equals(arraylist.get(j))) {
					arraylist.remove(j);
					j--;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arraylist.size(); i++) {
			sb.append(arraylist.get(i));
		}

		return sb.toString();

	}

}
