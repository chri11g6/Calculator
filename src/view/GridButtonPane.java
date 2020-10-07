package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

import view.ButtonCom.AddButton;
import view.ButtonCom.ClearButton;
import view.ButtonCom.CosButton;
import view.ButtonCom.DivButton;
import view.ButtonCom.EqButton;
import view.ButtonCom.InputButton;
import view.ButtonCom.MulButton;
import view.ButtonCom.PowButton;
import view.ButtonCom.SinButton;
import view.ButtonCom.SqrtButton;
import view.ButtonCom.SubButton;
import view.ButtonCom.TanButton;

public class GridButtonPane {
	public GridPane load() {
		GridPane grid = new GridPane();

		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPrefWidth(100);
		col1.setMinWidth(50);
		col1.setHgrow(Priority.SOMETIMES);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPrefWidth(100);
		col2.setMinWidth(50);
		col2.setHgrow(Priority.SOMETIMES);
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setPrefWidth(100);
		col3.setMinWidth(50);
		col3.setHgrow(Priority.SOMETIMES);
		ColumnConstraints col4 = new ColumnConstraints();
		col4.setPrefWidth(100);
		col4.setMinWidth(50);
		col4.setHgrow(Priority.SOMETIMES);
		ColumnConstraints col5 = new ColumnConstraints();
		col5.setPrefWidth(100);
		col5.setMinWidth(50);
		col5.setHgrow(Priority.SOMETIMES);

		grid.getColumnConstraints().addAll(col1, col2, col3, col4, col5);

		grid.setAlignment(Pos.CENTER);

		Button btn0 = new InputButton().load("0");
		grid.add(btn0, 0, 4, 2, 1);
		GridPane.setFillHeight(btn0, true);
		GridPane.setFillWidth(btn0, true);
		
		grid.add(new InputButton().load("1"), 0, 3);
		
		grid.add(new InputButton().load("2"), 1, 3);
		
		grid.add(new InputButton().load("3"), 2, 3);
		
		grid.add(new InputButton().load("4"), 0, 2);
		
		grid.add(new InputButton().load("5"), 1, 2);
		
		grid.add(new InputButton().load("6"), 2, 2);
		
		grid.add(new InputButton().load("7"), 0, 1);
		
		grid.add(new InputButton().load("8"), 1, 1);
		
		grid.add(new InputButton().load("9"), 2, 1);
		
		grid.add(new InputButton().load(","), 2, 4);

		grid.add(new AddButton().load("+"), 3, 2, 1, 2);
		
		grid.add(new SubButton().load("-"), 3, 1);
		
		grid.add(new MulButton().load("*"), 2, 0);
		
		grid.add(new DivButton().load("/"), 1, 0);

		grid.add(new ClearButton().load("CE"), 0, 0);

		grid.add(new PowButton().load("^"), 3, 0);
		grid.add(new EqButton().load("="), 3, 4);
		grid.add(new SqrtButton().load("√"), 4, 0);
		grid.add(new SinButton().load("Sin"), 4, 1);
		grid.add(new CosButton().load("Cos"), 4, 2);
		grid.add(new TanButton().load("Tan"), 4, 3);

		return grid;
	}

}
