package application;

/*** Objective: Make a basic calculator with a squareroot function
 * Algorithm: Javafx
 * Description how to resolve the problem: Turns both input numbers into doubles which are then rooted to provide the proper answer
 * Input and Output: 2 numbers, 1 added/subtracted/multiplied/divided/squarerooted result
 * Created by: Ivan Torres
 * Date: 7/9/2023
 * Version: 1.0.0
 * */


import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.lang.Math;

public class Torres_Project15 extends Application {

	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		pane.setHgap(2);
		
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		TextField tfResult = new TextField();
		
		tfNumber1.setPrefColumnCount(3);
		tfNumber2.setPrefColumnCount(3);
		tfResult.setPrefColumnCount(3);
		
		pane.getChildren().addAll(new Label("Number 1: "), tfNumber1, 
				new Label("Number 2: "), tfNumber2, 
				new Label("Result: "), tfResult);
		
		HBox hBox = new HBox(5);
		Button btAdd = new Button("Add");
		Button btSubtract = new Button("Subtract");
		Button btMultiply = new Button("Multiply");
		Button btDivide = new Button("Divide");
		Button btsqRoot = new Button("Square Root");
		
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(btAdd,btSubtract,btMultiply,btDivide,btsqRoot);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		
		Scene scene = new Scene(borderPane, 350,100);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		btAdd.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) + 
						Double.parseDouble(tfNumber2.getText()) + "");
				});
		btSubtract.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) - 
					Double.parseDouble(tfNumber2.getText()) + "");
			});
		btMultiply.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) * 
					Double.parseDouble(tfNumber2.getText()) + "");
			});
		btDivide.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) / 
					Double.parseDouble(tfNumber2.getText()) + "");
			});
		btsqRoot.setOnAction(e -> {
			double n1 = Double.parseDouble(tfNumber1.getText());
			double n2 = 1 / Double.parseDouble(tfNumber2.getText());
			double answer = Math.pow(n1, n2);
			tfResult.setText(answer + "");
			});

		
	}
	
}
