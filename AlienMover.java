package alienMover;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class AlienMover {
    private Alien alien;
    public AlienMover(Pane alienPane, HBox buttonPane) {
        setupButtons(buttonPane);
        this.alien = new Alien(alienPane);
    }

    public void setupButtons(HBox buttonPane) {
        Button b1 = new Button("Move Left!");
        Button b2 = new Button("Move Right!");
        buttonPane.getChildren().addAll(b1, b2);
        buttonPane.setSpacing(Constants.BUTTON_SPACING);
        buttonPane.setAlignment(Pos.CENTER);
        b1.setOnAction((ActionEvent e) -> this.alien.moveLeft());
        b2.setOnAction((ActionEvent e) -> this.alien.moveRight());
    }

}