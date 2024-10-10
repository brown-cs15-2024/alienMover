package alienMover;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class PaneOrganizer {
    private BorderPane root;
    public PaneOrganizer() {
        this.root = new BorderPane();
        Pane alienPane = new Pane();
        this.root.setCenter(alienPane);
        HBox buttonPane = new HBox();
        this.root.setBottom(buttonPane);
        new AlienMover(alienPane, buttonPane);
    }

    public Pane getRoot() {
        return this.root;
    }
}