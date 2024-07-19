package com.example.game;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;

public class Adult3Popup implements Initializable {

    @FXML
    private ImageView are, cat, duck, empty, excel, heart, how, meeting;

    @FXML
    private ImageView shadow1, shadow2, shadow3, shadow4;

    @FXML
    private ImageView take, care, of, yourself;

    @FXML
    void handleDragDone(DragEvent event) {
    }

    private double mouseAnchorX, mouseAnchorY;

    Drag drag = new Drag();

    public void initialize(URL location, ResourceBundle resources) {
        drag.makeDraggableSnap(take,shadow1);
        drag.makeDraggableSnap(care,shadow2);
        drag.makeDraggableSnap(of, shadow3);
        drag.makeDraggableSnap(yourself, shadow4);

        drag.makeDraggable(are);
        drag.makeDraggable(cat);
        drag.makeDraggable(duck);
        drag.makeDraggable(empty);
        drag.makeDraggable(excel);
        drag.makeDraggable(heart);
        drag.makeDraggable(how);
        drag.makeDraggable(meeting);
    }
}

