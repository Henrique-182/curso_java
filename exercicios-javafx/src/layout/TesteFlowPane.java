package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		
		//espaçamento entre elementos dentro da aplicação
		setHgap(10);
		setVgap(10);
		// espaçamento entre elementos fora da aplicação
		setPadding(new Insets(10));
		
		setOrientation(Orientation.VERTICAL);
		setAlignment(Pos.CENTER_RIGHT);
		
		getChildren().addAll(q1, q2, q3, q4, q5);
	}
}
